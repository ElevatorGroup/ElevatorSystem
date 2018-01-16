package cn.elevator.service.user;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.User;



public interface  UserService {
	public User login(String userName) throws Exception;
	
	 //通过角色和角色id获取对应的电梯list
	  public User getElevatorInfoList(
			  Integer userRole,
			  Integer id,
			  Integer buildingId,
			  Integer Company_YId,
			  Integer maintenanceId,
			  Integer elevatorType,
			  String elevatorCode,
			  String registrationCode,
			  Integer registrationStatus,
			  Integer usingState,
			  Integer from,
			  Integer pageSize)throws Exception;
	  
	  //通过不同的角色获取电梯条数
		 public int getCountBy(
				  Integer userRole,
				  Integer id,
				  Integer buildingId,
				  Integer Company_YId,
				  Integer maintenanceId,
				  Integer elevatorType,
				  String elevatorCode,
				  String registrationCode,
				  Integer registrationStatus,
				  Integer usingState
				 );

	 
}
