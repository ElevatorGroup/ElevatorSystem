package cn.elevator.service.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Building;
import cn.elevator.entity.Maintenance;
import cn.elevator.entity.Realty;
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
		 
		 //通过id修改User对象
		 public Boolean updateUser(User user)throws Exception;
		 
		 //通过id获得User对象
		 public User getUserById(Integer id)throws Exception;
		 
		 //物业管理员和维保管理员查看管理员工list列表
		 public List<User> getUser_pt(Integer userRole,Integer id)throws Exception;
		 
		 //用户注册
		 public Boolean saveUser(User user)throws Exception;
		 /**
			 * 
			 * @param user
			 * @param building
			 * @return
			 * @throws Exception
			 */
			public Boolean buildingRegister(User user,Building building) throws Exception;
			/**
			 * 
			 * @param user
			 * @param building
			 * @return
			 * @throws Exception
			 */
			public Boolean realtyRegister(User user,Realty realty) throws Exception;
			/**
			 * 
			 * @param user
			 * @param building
			 * @return
			 * @throws Exception
			 */
			public Boolean maintenanceRegister(User user,Maintenance maintenance) throws Exception;
	 
}
