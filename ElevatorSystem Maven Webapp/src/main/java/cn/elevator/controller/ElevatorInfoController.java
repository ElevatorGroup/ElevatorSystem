package cn.elevator.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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

	// 跳到List界面
	@RequestMapping(value = "/elevatorListUI")
	public String elevatorMain(
			Model model,
			HttpSession session,
			HttpServletRequest request,
			@RequestParam(value = "buildingId", required = false) Integer buildingId,
			@RequestParam(value = "Company_YId", required = false) Integer Company_YId,
			@RequestParam(value = "maintenanceId", required = false) Integer maintenanceId,
			@RequestParam(value = "elevatorType", required = false) Integer elevatorType,
			@RequestParam(value = "elevatorCode", required = false) String elevatorCode,
			@RequestParam(value = "registrationCode", required = false) String registrationCode,
			@RequestParam(value = "registrationStatus", required = false) Integer registrationStatus,
			@RequestParam(value = "usingState", required = false) Integer usingState,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "limit", required = false) Integer limit)
			throws Exception {
		
		if(elevatorCode!=null){
			logger.debug("空格之前"+elevatorCode);
			String trimElevatorCode=elevatorCode.trim();
			elevatorCode=trimElevatorCode;
			logger.debug("去空格之后"+elevatorCode);
		}
		
		if(registrationCode!=null){
			String trimRegistrationCode=registrationCode.trim();
			registrationCode=trimRegistrationCode;
		}
		// 模糊查询的选择初始值：电梯类型，注册状态，使用状态
		model.addAttribute("elevatorTypeList",
				dictionaryService.getElevatorType());
		model.addAttribute("registrationStatusList",
				dictionaryService.getRegistrationStatus());
		model.addAttribute("usingStateList", dictionaryService.getUsingState());
		List<Building> buildingNameList = new ArrayList<Building>();

		buildingNameList = elevatorInfoService.getBuildingName(((User) session
				.getAttribute(Constants.USER_SESSION)).getUserRole(),
				((User) session.getAttribute(Constants.USER_SESSION)).getId());
		logger.debug("楼盘名称：>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
				+ buildingNameList.size());
		model.addAttribute("buildingName", buildingNameList);
		logger.debug("页面URL：" + request.getQueryString());
		model.addAttribute("params", request.getQueryString());
		// limit每一页显示的条数
		if (null == limit || limit == 0) {
			limit = 10;
		}
		// page 页码，转换为显示位置
		if (null == page || page == 0) {
			page = 0;
		} else {
			page = (page - 1) * limit;
		}
		User user = (User) session.getAttribute(Constants.USER_SESSION);// 获取缓存session里的User对象
		logger.debug("页面获得的值是："+buildingId);
		model.addAttribute("buildingId", buildingId);
		model.addAttribute("Company_YId", Company_YId);
		model.addAttribute("maintenanceId", maintenanceId);
		model.addAttribute("elevatorType", elevatorType);
		model.addAttribute("elevatorCode", elevatorCode);
		model.addAttribute("registrationCode", registrationCode);
		model.addAttribute("registrationStatus", registrationStatus);
		model.addAttribute("usingState", usingState);
		
		return "elevatorList";
	}

	@ResponseBody
	// 用来拿取后台电梯的数据
	@RequestMapping(value = "/elevatorListData")
	public Object elevatorMain1(
			Model model,
			HttpSession session,
			HttpServletRequest request,
			@RequestParam(value = "buildingId", required = false) Integer buildingId,
			@RequestParam(value = "Company_YId", required = false) Integer Company_YId,
			@RequestParam(value = "maintenanceId", required = false) Integer maintenanceId,
			@RequestParam(value = "elevatorType", required = false) Integer elevatorType,
			@RequestParam(value = "elevatorCode", required = false) String elevatorCode,
			@RequestParam(value = "registrationCode", required = false) String registrationCode,
			@RequestParam(value = "registrationStatus", required = false) Integer registrationStatus,
			@RequestParam(value = "usingState", required = false) Integer usingState,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "limit", required = false) Integer limit)
			throws Exception {
		
		if(elevatorCode!=null){
			logger.debug("空格之前"+elevatorCode);
			String trimElevatorCode=elevatorCode.trim();
			elevatorCode=trimElevatorCode;
			logger.debug("去空格之后"+elevatorCode);
		}
		
		if(registrationCode!=null){
			String trimRegistrationCode=registrationCode.trim();
			registrationCode=trimRegistrationCode;
		}
		logger.debug("页面的参数是1111：" + registrationCode);

		Map<String, Object> elevatorInfoMap = new HashMap<String, Object>();
		/*logger.debug("页面URL：" + request.getQueryString());
		elevatorInfoMap.put("url", request.getQueryString());*/
		// limit每一页显示的条数
		if (null == limit || limit == 0) {
			limit = 10;
		}
		// page 页码，转换为显示位置
		if (null == page || page == 0) {
			page = 0;
		} else {
			page = (page - 1) * limit;
		}
		User user = (User) session.getAttribute(Constants.USER_SESSION);// 获取缓存session里的User对象

		// 进行角色判断
		List<ElevatorInfo> elevatorInfoList = new ArrayList<ElevatorInfo>();// 储层不同角色的电梯详情
		int elevatorCount = 0;// 储层不同角色的电梯总数据条数
		User userElevatorList = null;// 通过user对象获取的电梯集合
		logger.debug("页面的参数是：" + registrationCode);

		elevatorCount = userService.getCountBy(user.getUserRole(),
				user.getId(), buildingId, Company_YId, maintenanceId,
				elevatorType, elevatorCode, registrationCode,
				registrationStatus, usingState);
		userElevatorList = userService.getElevatorInfoList(user.getUserRole(),
				user.getId(), buildingId, Company_YId, maintenanceId,
				elevatorType, elevatorCode, registrationCode,
				registrationStatus, usingState, page, limit);
		if(userElevatorList==null){
			
		}else{
			elevatorInfoList = userElevatorList.getElevatorList();
		}

		

		logger.debug("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"
				+ elevatorCount);

		elevatorInfoMap.put("code", 0);
		elevatorInfoMap.put("msg", "");
		elevatorInfoMap.put("count", elevatorCount);
		elevatorInfoMap.put("data", elevatorInfoList);

		

		return elevatorInfoMap;

	}
	
	
	@ResponseBody
	// 单个电梯详细信息
	@RequestMapping(value = "/elevatorDetail")
	public Object getElevator(@RequestParam(value = "id", required =true)Integer id){
		ElevatorInfo ele=null;
		try {
			ele=elevatorInfoService.getElevatorById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ele;
		
	}


	

}
