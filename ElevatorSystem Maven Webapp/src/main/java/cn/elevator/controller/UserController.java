package cn.elevator.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

import cn.elevator.entity.ElevatorInfo;
import cn.elevator.entity.User;
import cn.elevator.service.user.UserService;
import cn.elevator.tools.Constants;
import cn.elevator.tools.MD5Tool;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;
//登录界面
	@RequestMapping(value = "/login")
	public String login() {
		return "userLogin";
	}
//登录处理
	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
	public String dologin(@RequestParam String userName,
			@RequestParam String password, Model model, HttpSession session)
			throws Exception {
		User user = userService.login(userName);
		if (user == null) {
			model.addAttribute(Constants.SYS_MESSAGE, "用户名不存在！");
			return "userLogin";
		} else if (!user.getPassword().equals(password)) {
			model.addAttribute(Constants.SYS_MESSAGE, "密码错误！");
			return "userLogin";
		}
		session.setAttribute(Constants.USER_SESSION, user);
		return "redirect:/elevator/elevatorListUI";
	}
	
	
	
//退出功能
		@RequestMapping(value = "/logout")
		public String logout( HttpSession session)
				throws Exception {
			session.removeAttribute("Constants.USER_SESSION");
			logger.debug("sessioin里的值："+((User)session.getAttribute("Constants.USER_SESSION")).getWenXin());
			return "/login";
		}
		
		
		
		
//注册页面
//注册处理
		
		
		/*@ResponseBody
		@RequestMapping("/test/{id}")
		public Object getList(@PathVariable("id")Integer id) throws Exception{
			System.out.println(">>>>>>>>>>>>test");
			User user=userService.getElevatorInfoList(id);
			List<ElevatorInfo> list=user.getElevatorList();
			return list;
		}*/
		
}
