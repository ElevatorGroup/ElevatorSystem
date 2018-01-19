package cn.elevator.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.MatrixParam;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.elevator.entity.ElevatorInfo;
import cn.elevator.entity.Maintenance;
import cn.elevator.entity.User;
import cn.elevator.service.maintenance.MaintenanceService;
import cn.elevator.service.user.UserService;
import cn.elevator.tools.Constants;
import cn.elevator.tools.MD5Tool;

@Controller
@RequestMapping(value = "/maintenance")
public class MaintenanceController {
	private Logger logger = Logger.getLogger(MaintenanceController.class);
	@Resource
	private MaintenanceService maintenanceService;
//查看维保公司信息
	@RequestMapping(value = "/maintenanceView")
	public String maintenance(HttpSession session,Model model) throws Exception {
		User user=(User) session.getAttribute(Constants.USER_SESSION);
		
		Maintenance maintenance=maintenanceService.getMaintenance(user.getId(), user.getUserRole());
		model.addAttribute("maintenance", maintenance);
		return "maintenance";
	}
	
	
	//修改维保公司信息页面
	@RequestMapping(value="/maintenanceModify")
	public String maintenanceModify(HttpSession session,Model model) throws Exception{
		//首先获取维保公司的信息
		User user=(User) session.getAttribute(Constants.USER_SESSION);
		
		Maintenance maintenance=maintenanceService.getMaintenance(user.getId(), user.getUserRole());
		model.addAttribute("maintenance", maintenance);
		
		return "maintenanceModify";
	}
	
	
	//修改维保公司信息处理后的页面
	@RequestMapping(value="/maintenanceModifySave")
	public String doMaintenanceModify(
			HttpSession session,
			HttpServletRequest request,
			Model model,
			Maintenance maintenance,
			MultipartFile attach
			){
		logger.debug("=============================>进入修改操作");
		//存入到数据库的路径
		String logoPicPath =  null;
		if(!attach.isEmpty()){
			//在服务器创建一个存放图片的路径
			String path = request.getSession().getServletContext().getRealPath("statics"+File.separator+"uploadfiles");
			logger.info("uploadFile path: " + path);
			
			String oldFileName = attach.getOriginalFilename();//原文件名
			String prefix = FilenameUtils.getExtension(oldFileName);//原文件后缀
			int filesize = 5000000;
			if(attach.getSize() > filesize){//上传大小不得超过 5M
				model.addAttribute("fileUploadError", Constants.FILEUPLOAD_ERROR_4);
            	 return "maintenanceModify";
            }else if(prefix.equalsIgnoreCase("jpg") || prefix.equalsIgnoreCase("png") 
			   ||prefix.equalsIgnoreCase("jepg") || prefix.equalsIgnoreCase("pneg")){//上传图片格式
            	//上传图片新名字为
				 String fileName =  System.currentTimeMillis()+ "."+prefix;//时间戳+原后缀
				 File targetFile = new File(path,fileName);
				 if(!targetFile.exists()){
					 targetFile.mkdirs();
				 }
				 try {
					 //图片上传动作
					attach.transferTo(targetFile);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return "maintenanceModify";
				} 
				 //截取相对路径
				 logoPicPath = request.getContextPath()+File.separator+"statics"+File.separator+"uploadfiles"+File.separator+fileName;
            }else{
            	model.addAttribute("fileUploadError", Constants.FILEUPLOAD_ERROR_3);
            	return "maintenanceModify";
            }
		}
		//首先获取维保公司的信息
				User user=(User) session.getAttribute(Constants.USER_SESSION);
				maintenance.setBusinessLicense(logoPicPath);
				maintenance.setUpdatDate(new Date());
				maintenance.setUpdater(user.getUserName());
				Boolean flag=false;
				try {
					flag = maintenanceService.updateMaintenance(maintenance);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(flag==false){
					model.addAttribute("fileUploadError", "修改失败！");
					return "maintenanceModify";
				}
		return "redirect:/maintenance/maintenanceView";
	}


//维保管理人员页面
	@RequestMapping(value="/maintenanceUser")
	public String maintenanceUser(){
		return "maintenanceUser";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/userDabase")
	public Object getUserList(HttpSession session){
		User user=(User) session.getAttribute(Constants.USER_SESSION);
		List<User> userList=new ArrayList<User>();//储存查询出的userList
		Map<String,Object> map=new HashMap<String,Object>();
				try {
					userList=maintenanceService.getUserList(user.getId(),user.getUserRole());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		map.put("code", 0);
		map.put("msg", "");
		map.put("count",userList.size());
		map.put("data",userList);
		return map;
	}
}
