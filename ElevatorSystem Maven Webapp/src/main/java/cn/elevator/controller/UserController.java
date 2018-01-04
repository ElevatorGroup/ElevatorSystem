package cn.elevator.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value = "/login")
	public String login() {
		return "userLogin";
	}

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
		return "redirect:/user/elevatorListUI";

		/*
		 * try {
		 * 
		 * user = userService.login(userName); } catch (Exception e) {
		 * e.printStackTrace(); } if (null != user) {// 登录成功
		 * logger.debug("=====================数据库拿到的用户名：" + user.getUserName() +
		 * user.getPassword()); // 登录成功 if
		 * (user.getPassword().equals(MD5Tool.getMD5(password))) { // 放入session
		 * session.setAttribute(Constants.USER_SESSION,user);
		 * logger.debug("登录成功！"); return "redirect:/user/elevatorListUI"; }else{
		 * model.addAttribute(Constants.SYS_MESSAGE, "密码错误！"); return
		 * "userLogin"; }
		 * 
		 * }else{ model.addAttribute(Constants.SYS_MESSAGE,"用户不存在！");
		 * logger.debug("登录失败"); return "userLogin"; }
		 */
	}

	/*
	 * @ExceptionHandler(value = { UnknownAccountException.class,
	 * IncorrectCredentialsException.class }) public String
	 * handleException(UnknownAccountException e1, IncorrectCredentialsException
	 * e2, HttpServletRequest req) { req.setAttribute("e1", e1);
	 * req.setAttribute("e2", e2); return "userLogin"; }
	 */
	@RequestMapping(value = "/elevatorListUI", method = RequestMethod.GET)
	public String elevatorMain() throws Exception {
		/*
		 * User user=(User) session.getAttribute(Constants.USER_SESSION);
		 * if(user!=null){ return "elevatorList"; }
		 */
		return "elevatorList";

	}

}
