package cn.elevator.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.elevator.entity.ElevatorInfo;
import cn.elevator.entity.User;
import cn.elevator.service.elevatorInfo.ElevatorInfoService;
import cn.elevator.service.user.UserService;
import cn.elevator.tools.Constants;

@Controller
@RequestMapping("/elevator")
public class ElevatorInfoController {
	private Logger logger = Logger.getLogger(ElevatorInfoController.class);
	@Autowired
	private ElevatorInfoService elevatorInfoService;
	@Autowired
	private UserService userService;

	//跳到List界面
		@RequestMapping(value = "/elevatorListUI", method = RequestMethod.GET)
		public String elevatorMain(Model model,HttpSession session) throws Exception {
			User user=(User)session.getAttribute(Constants.USER_SESSION);
				
			List<ElevatorInfo> elevatorInfoList=new ArrayList<ElevatorInfo>();
			logger.debug("处理后跳转的页面###################");
			if(user.getUserRole()==0){
				logger.debug("$$$$质检局用户============");
			}else if(user.getUserRole()==1){
				logger.debug("$$$$楼盘用户============");
				logger.debug("获取的公司id"+user.getCompanyId());
				
				for(int i=0;i<elevatorInfoList.size();i++){
					logger.debug("**********************"+elevatorInfoList.get(i).getElevatorNumber());
				}
			}else if(user.getUserRole()==2){
				logger.debug("$$$$物业管理员============");
			}else if(user.getUserRole()==3){
				logger.debug("$$$$物业普通员工============");
			}else if(user.getUserRole()==4){
				logger.debug("$$$$维保管理员============");
			}else if(user.getUserRole()==5){
				logger.debug("$$$$维保普通员工============");
			}
			model.addAttribute("elevatorInfoList", elevatorInfoList);
			return "elevatorList";

		}
		@ResponseBody//用来拿取后台电梯的数据
		@RequestMapping(value = "/elevatorListData", method = RequestMethod.GET)
		public Object elevatorMain1(HttpSession session) throws Exception {
				Map<String,Object> elevatorInfoMap=new HashMap<String,Object>();
			List<ElevatorInfo> elevatorInfoList=new ArrayList<ElevatorInfo>();
			elevatorInfoList=elevatorInfoService.getElevatorList(((User)session.getAttribute(Constants.USER_SESSION)).getCompanyId());
			elevatorInfoMap.put("code",0);
			elevatorInfoMap.put("msg","");
			elevatorInfoMap.put("count",elevatorInfoList.size());
			elevatorInfoMap.put("data",elevatorInfoList);
			return elevatorInfoMap;

		}
		
		
	
	
	
	}
