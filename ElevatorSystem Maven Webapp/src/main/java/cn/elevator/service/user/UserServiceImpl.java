package cn.elevator.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



import cn.elevator.dao.user.UserMapper;
import cn.elevator.entity.User;


@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	
	public User login(String userName) throws Exception {
	
		User user = null;
		user = userMapper.login(userName);
		return user;
	}


	


	@Override
	public User getElevatorInfoList(Integer userRole, Integer id,
			Integer buildingId, Integer Company_YId, Integer maintenanceId,
			Integer elevatorType, String elevatorCode,
			String registrationCode, Integer registrationStatus,
			Integer usingState, Integer from, Integer pageSize)
			throws Exception {
		return userMapper.getElevatorInfoList(userRole, id, buildingId, Company_YId, maintenanceId, elevatorType, elevatorCode, registrationCode, registrationStatus, usingState, from, pageSize);
	}



























	@Override
	public int getCountBy(Integer userRole, Integer id, Integer buildingId,
			Integer Company_YId, Integer maintenanceId, Integer elevatorType,
			String elevatorCode, String registrationCode,
			Integer registrationStatus, Integer usingState) {
		// TODO Auto-generated method stub
		return userMapper.getCountBy(userRole, id, buildingId, Company_YId, maintenanceId, elevatorType, elevatorCode, registrationCode, registrationStatus, usingState);
	}


}
