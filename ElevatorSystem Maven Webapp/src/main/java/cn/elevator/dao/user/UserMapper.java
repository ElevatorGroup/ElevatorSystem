package cn.elevator.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.elevator.entity.User;

public interface UserMapper {
	/**
	 * 通过userName获取User
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	  public User login(@Param("userName")String userName)throws Exception;
	 
	  
	  //通过角色和角色id获取对应的电梯list
	  public User getElevatorInfoList(
			  @Param("userRole")Integer userRole,
			  @Param("id")Integer id,
			  @Param("buildingId")Integer buildingId,
			  @Param("Company_YId")Integer Company_YId,
			  @Param("maintenanceId")Integer maintenanceId,
			  @Param("elevatorType")Integer elevatorType,
			  @Param("elevatorCode")String elevatorCode,
			  @Param("registrationCode")String registrationCode,
			  @Param("registrationStatus")Integer registrationStatus,
			  @Param("usingState")Integer usingState,
			  @Param("from")Integer from,
			  @Param("pageSize")Integer pageSize

			  )throws Exception;
	  
	  
	  //通过不同的角色获取电梯条数
	 public int getCountBy(
			  @Param("userRole")Integer userRole,
			  @Param("id")Integer id,
			  @Param("buildingId")Integer buildingId,
			  @Param("Company_YId")Integer Company_YId,
			  @Param("maintenanceId")Integer maintenanceId,
			  @Param("elevatorType")Integer elevatorType,
			  @Param("elevatorCode")String elevatorCode,
			  @Param("registrationCode")String registrationCode,
			  @Param("registrationStatus")Integer registrationStatus,
			  @Param("usingState")Integer usingState
			  
			 );
	 
	 //通过id修改User对象
	 public int updateUser(User user)throws Exception;
	
	 //通过id获得User对象
	 public User getUserById(@Param("id")Integer id)throws Exception;
	 
	 //物业管理员和维保管理员查看管理员工list列表
	 public List<User> getUser_pt(@Param("userRole")Integer userRole,@Param("id")Integer id)throws Exception;
	 
	 //用户注册
	 public Integer saveUser(User user)throws Exception;
	
}
