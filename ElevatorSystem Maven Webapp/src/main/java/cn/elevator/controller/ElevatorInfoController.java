package cn.elevator.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.elevator.entity.Building;
import cn.elevator.entity.ElevatorInfo;
import cn.elevator.entity.User;
import cn.elevator.service.building.BuildingService;
import cn.elevator.service.dectionary.DictionaryService;
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
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private DictionaryService dictionaryService;

	//跳到List界面
		@RequestMapping(value = "/elevatorListUI")
		public String elevatorMain(Model model) throws Exception {	
			//模糊查询的选择初始值：电梯类型，注册状态，使用状态
			model.addAttribute("elevatorTypeList", dictionaryService.getElevatorType());
			model.addAttribute("registrationStatusList", dictionaryService.getRegistrationStatus());
			model.addAttribute("usingStateList", dictionaryService.getUsingState());
			
			return "elevatorList";

		}
		@ResponseBody//用来拿取后台电梯的数据
		@RequestMapping(value = "/elevatorListData")
		public Object elevatorMain1(Model model,HttpSession session,
				/*@RequestParam(value="userRole",required=true) Integer userRole,
				@RequestParam(value="id",required=true) Integer id,*/
				@RequestParam(value="buildingId",required=false) Integer buildingId,
				@RequestParam(value="Company_YId",required=false) Integer Company_YId,
				@RequestParam(value="maintenanceId",required=false) Integer maintenanceId,
				@RequestParam(value="elevatorType",required=false) Integer elevatorType,
				@RequestParam(value="elevatorCode",required=false) String elevatorCode,
				@RequestParam(value="registrationCode",required=false) String registrationCode,
				@RequestParam(value="registrationStatus",required=false) Integer registrationStatus,
				@RequestParam(value="usingState",required=false) Integer usingState,
				@RequestParam(value="page",required=false) Integer page,
				@RequestParam(value="limit",required=false) Integer limit
				) throws Exception {
			
				Map<String,Object> elevatorInfoMap=new HashMap<String,Object>();
			
			//limit每一页显示的条数
			if(null==limit||limit==0){
				limit=10;
			}
			//page 页码，转换为显示位置
			if(null==page||page==0){
				page=10;
			}else{
				page=(page-1)*limit;
			}
			User user=(User)session.getAttribute(Constants.USER_SESSION);//获取缓存session里的User对象
			
			//进行角色判断
			List<ElevatorInfo> elevatorInfoList=new ArrayList<ElevatorInfo>();//储层不同角色的电梯详情
			int elevatorCount=0;//储层不同角色的电梯总数据条数
			User userElevatorList=null;//通过user对象获取的电梯集合
			if(user.getUserRole()==0){
				elevatorCount=userService.getCountBy0(user.getUserRole(), user.getId());
			}else if(user.getUserRole()==1){
				elevatorCount=userService.getCountBy1(user.getUserRole(), user.getId());
			}else if(user.getUserRole()==2){
				elevatorCount=userService.getCountBy2(user.getUserRole(), user.getId());
			}else if(user.getUserRole()==3){
				elevatorCount=userService.getCountBy3(user.getUserRole(), user.getId());
			}else if(user.getUserRole()==4){
				elevatorCount=userService.getCountBy4(user.getUserRole(), user.getId());
			}else if(user.getUserRole()==5){
				elevatorCount=userService.getCountBy5(user.getUserRole(), user.getId());
			}
			
			userElevatorList=userService.getElevatorInfoList(
					user.getUserRole(),user.getId(),
					 buildingId,Company_YId, maintenanceId, 
					elevatorType, elevatorCode,
					registrationCode, registrationStatus, 
					usingState, page,
					limit);
			
			elevatorInfoList=userElevatorList.getElevatorList();
			
			logger.debug("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+elevatorCount);
			
			elevatorInfoMap.put("code",0);
			elevatorInfoMap.put("msg","");
			elevatorInfoMap.put("count",elevatorCount);
			elevatorInfoMap.put("data",elevatorInfoList);
			return elevatorInfoMap;

		}
		
		
	
	
	
	}
