package cn.elevator.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.elevator.entity.Building;
import cn.elevator.entity.ElevatorInfo;
import cn.elevator.entity.Maintenance;
import cn.elevator.entity.MessageRecord;
import cn.elevator.entity.Realty;
import cn.elevator.entity.User;
import cn.elevator.service.building.BuildingService;
import cn.elevator.service.maintenance.MaintenanceService;
import cn.elevator.service.messageRecord.MessageRecordService;
import cn.elevator.service.realty.RealtyService;
import cn.elevator.service.user.UserService;
import cn.elevator.sms.SmsVariable;
import cn.elevator.sms.response.SmsVariableResponse;
import cn.elevator.tools.Constants;
import cn.elevator.tools.MD5Tool;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private RealtyService realtyService;
	@Autowired
	private MaintenanceService maintenanceService;
	@Autowired
	private MessageRecordService messageRecordService;

	// 登录界面
	@RequestMapping(value = "/login")
	public String login() {
		return "userLogin";
	}

	// 通过id获取User对象
	@ResponseBody
	@RequestMapping(value = "/UserById")
	public User getUserById(
			@RequestParam(value = "id", required = true) Integer id) {
		User userData = null;
		try {
			userData = userService.getUserById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userData;
	}

	// 传递普通用户对象列表让管理人员分配工作
	@ResponseBody
	@RequestMapping(value = "/getUser_pt")
	public List<User> getUser_pt(HttpSession session) {
		User ur = (User) session.getAttribute(Constants.USER_SESSION);
		List<User> userList = new ArrayList<User>();
		try {
			userList = userService.getUser_pt(ur.getUserRole(), ur.getId());
			logger.debug("员工人数：" + userList.size());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;

	}

	// 登录处理
		@RequestMapping(value = "/dologin", method = RequestMethod.POST)
		public String dologin(@RequestParam String userName,
				@RequestParam String password, Model model, HttpSession session)
				throws Exception {
			User user = userService.login(userName);
			if (user == null) {
				model.addAttribute(Constants.SYS_MESSAGE, "用户名不存在！");
				return "userLogin";
			} else {
				// 加密用户输入的密码
				String MD5Pass = MD5Tool.getMD5(
						MD5Tool.decodeBase64(user.getSalt()), password);
				if (!user.getPassword().equals(MD5Pass)) {
					model.addAttribute(Constants.SYS_MESSAGE, "密码错误！");
					return "userLogin";
				}
			}
			session.setAttribute(Constants.USER_SESSION, user);
			return "redirect:/elevator/elevatorListUI";
		}

		// 前往注册页面
		@RequestMapping(value = "/register")
		public String register() {
			return "register";
		}

		// 注册
		@RequestMapping(value = "/doRegister", method = RequestMethod.POST)
		public String doRegister(HttpSession session,
				String province,
				String city,
				@RequestParam(value = "district",required=false)String district,User user, Building building,
				Realty realty, Maintenance maintenance, HttpServletRequest request,
				@RequestParam(value = "simage") MultipartFile attach)
				throws Exception {
			String imagePath = null;
			// String logoLocPath = null;
			if (!attach.isEmpty()) {
				String path = request
						.getSession()
						.getServletContext()
						.getRealPath(
								"statics" + java.io.File.separator + "uploadfiles");
				logger.info("uploadFile path: " + path);
				String oldFileName = attach.getOriginalFilename();// 原文件名
				String prefix = FilenameUtils.getExtension(oldFileName);// 原文件后缀
				int filesize = 500000000;
				System.out.println("文件大小为："+attach.getSize());
				if (attach.getSize() > filesize) {// 上传大小不得超过 5M
					request.setAttribute("fileUploadError",
							Constants.FILEUPLOAD_ERROR_4);
					return "register";
				} else if (prefix.equalsIgnoreCase("jpg")
						|| prefix.equalsIgnoreCase("png")
						|| prefix.equalsIgnoreCase("jepg")
						|| prefix.equalsIgnoreCase("pneg")) {// 上传图片格式
					String fileName = building.getCompanyName() + ".jpg";// 上传LOGO图片命名:apk名称.apk
					File targetFile = new File(path, fileName);
					if (!targetFile.exists()) {
						targetFile.mkdirs();
					}
					try {
						attach.transferTo(targetFile);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						request.setAttribute("fileUploadError",
								Constants.FILEUPLOAD_ERROR_2);
						return "register";
					}
					imagePath = request.getContextPath() + "/statics/uploadfiles/"
							+ fileName;
					// logoLocPath = path+File.separator+fileName;
				} else {
					request.setAttribute("fileUploadError",
							Constants.FILEUPLOAD_ERROR_3);
					return "register";
				}
			}
			// 随机生成盐值，保存到数据库
			Random rand = new Random();
			byte[] salt = new byte[12];
			rand.nextBytes(salt);
			String MD5Pass = MD5Tool.getMD5(salt, user.getPassword());
			user.setSalt(MD5Tool.encodeBase64(salt));
			user.setPassword(MD5Pass);
			user.setCreater(user.getUserName());
			user.setCreateDate(new Date());
			user.setDeleted(2);//未审核
			String address="";
			if("—— 区 ——".equals(district))
				district="";
			if (user.getUserRole() == 1) {// 如果是楼盘注册
				building.setCreater(user.getUserName());
				building.setCreateDate(new Date());
				building.setBusinessLicense(imagePath);
				address=province+city+district+building.getCompanyAddress();
				building.setCompanyAddress(address);
				try {
					if (userService.buildingRegister(user, building)) {
						return "redirect:/user/login";
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (user.getUserRole() == 2) {// 如果是物业管理员注册
				realty.setCreater(user.getUserName());
				realty.setCreateDate(new Date());
				realty.setBusinessLicense(imagePath);
				address=province+city+district+realty.getCompanyAddress();
				realty.setCompanyAddress(address);
				try {
					if (userService.realtyRegister(user, realty)) {
						return "redirect:/user/login";
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (user.getUserRole() == 4) {// 如果是维保管理员注册
				maintenance.setCreater(user.getUserName());
				maintenance.setCreateDate(new Date());
				maintenance.setBusinessLicense(imagePath);
				address=province+city+district+maintenance.getCompanyAddress();
				maintenance.setCompanyAddress(address);
				try {
					if (userService.maintenanceRegister(user, maintenance)) {
						return "redirect:/user/login";
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return "register";
		}

		@ResponseBody
		@RequestMapping(value = "/nameExist")
		public HashMap<String, String> nameExist(String flag, String name)
				throws Exception {
			HashMap<String, String> result = new HashMap<String, String>();
			result.put("result", "exist");
			if (flag == null || "".equals(flag) || name == null || "".equals(name)) {
				result.put("result", "empty");
			} else if ("user".equals(flag)) {// 验证用户名是否存在
				if (userService.login(name) == null)
					result.put("result", "noexist");
			} else if ("company".equals(flag)) {// 验证楼盘公司名是否存在
				if (buildingService.getBuildingByName(name) == null
						&& realtyService.getRealtyByName(name) == null
						&& maintenanceService.getMaintenanceByName(name) == null)
					result.put("result", "noexist");
			}
			return result;
		}

		// 发送验证码
		@ResponseBody
		@RequestMapping(value = "/sendMessage")
		public HashMap<String, String> sendMessage(
				@RequestParam("phoneNumber") String phoneNumber) throws Exception {
			HashMap<String, String> data = new HashMap<String, String>();
			StringBuilder code = new StringBuilder();
			Random random = new Random();
			// 生成6位验证码 
			for (int i = 0; i < 6; i++) {
				code.append(String.valueOf(random.nextInt(10)));
			}
			String params=phoneNumber+","+code;
			String msg = "【海狸科技】欢迎使用电梯安全管理系统，您的注册验证码是："+code+"，3分钟内有效。";
			//发送短信
			SmsVariableResponse response=SmsVariable.sendMessage(params);
			//发送时间和过期时间
			Date sendTime = new Date();
			Calendar endTime = Calendar.getInstance();
			endTime.setTime(sendTime);
			endTime.add(Calendar.MINUTE, 3);// 过期时间
			//保存短信记录
			MessageRecord messageRecord = new MessageRecord(phoneNumber, msg,
					sendTime, endTime.getTime(), code.toString(),response.getCode(), "0".equals(response.getCode())?"操作成功":response.getErrorMsg(),
					response.getMsgId(), response.getFailNum()==null?0:Integer.valueOf(response.getFailNum()),response.getSuccessNum()==null?0: Integer.valueOf(response.getSuccessNum()));
			messageRecordService.saveMessageRecord(messageRecord);
			data.put("statusCode",response.getCode());
			return data;
		}

		// 判断验证码是否正确
		@ResponseBody
		@RequestMapping(value = "/validateCode")
		public HashMap<String, String> validateCode(
				@RequestParam("phoneNumber") String phoneNumber,
				@RequestParam("sCode") String sCode) throws Exception {
			HashMap<String, String> result = new HashMap<String, String>();
			MessageRecord messageRecord = messageRecordService
					.getMessageRecordByPhone(phoneNumber);
			if (messageRecord != null) {
				// 如果验证码不匹配
				if (!messageRecord.getSmsCode().equals(sCode))
					result.put("result", "error");
				// 如果验证码已经过期
				else if (messageRecord.getEndTime().getTime() < new Date()
						.getTime())
					result.put("result", "expire");
				else
					// 验证码可以使用
					result.put("result", "success");
			} else {// 找不到短信记录
				result.put("result", "noexist");
			}
			return result;
		}

		// 退出功能
		@RequestMapping(value = "/logout")
		public String logout(HttpSession session) throws Exception {
			session.removeAttribute("Constants.USER_SESSION");
			logger.debug("sessioin里的值："
					+ ((User) session.getAttribute("Constants.USER_SESSION"))
							.getWenXin());
			return "/login";
		}

}
