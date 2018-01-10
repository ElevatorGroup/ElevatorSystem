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
	public Integer getCountBy0(Integer userRole, Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getCountBy0(userRole, id);
	}





	@Override
	public Integer getCountBy1(Integer userRole, Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getCountBy1(userRole, id);
	}





	@Override
	public Integer getCountBy2(Integer userRole, Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getCountBy2(userRole, id);
	}





	@Override
	public Integer getCountBy3(Integer userRole, Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getCountBy3(userRole, id);
	}





	@Override
	public Integer getCountBy4(Integer userRole, Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getCountBy4(userRole, id);
	}





	@Override
	public Integer getCountBy5(Integer userRole, Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getCountBy5(userRole, id);
	}


}
