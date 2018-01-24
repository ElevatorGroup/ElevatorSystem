package cn.elevator.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



import cn.elevator.dao.building.BuildingMapper;
import cn.elevator.dao.maintenance.MaintenanceMapper;
import cn.elevator.dao.realty.RealtyMapper;
import cn.elevator.dao.user.UserMapper;
import cn.elevator.entity.Building;
import cn.elevator.entity.Maintenance;
import cn.elevator.entity.Realty;
import cn.elevator.entity.User;


@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	@Resource
	private RealtyMapper realtyMapper;
	@Resource
	private BuildingMapper buildingMapper;
	@Resource
	private MaintenanceMapper maintenanceMapper;
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





	@Override
	public Boolean updateUser(User user) throws Exception {
		Boolean bool=false;
		if(userMapper.updateUser(user)>0){
			bool=true;
		}else{
			bool=false;
		}
		return bool;
	}





	@Override
	public User getUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}





	@Override
	public List<User> getUser_pt(Integer userRole, Integer id) throws Exception {
		
		return userMapper.getUser_pt(userRole, id);
	}





	@Override
	public Boolean saveUser(User user) throws Exception {
		Boolean bool=false;
		if(userMapper.saveUser(user)>0){
			bool=true;
		}
		return bool;
	}

	@Override
	public Boolean buildingRegister(User user, Building building)
			throws Exception {
		// TODO Auto-generated method stub
		Boolean flag = false;
		if (userMapper.saveUser(user) > 0
				&& buildingMapper.saveBuilding(building) > 0) {
			Integer buildingId=buildingMapper.getBuildingByName(
					building.getCompanyName()).getId();
			User newUser =userMapper.login(user.getUserName());
			newUser.setCompanyId(buildingId);
			if (userMapper.updateUser(newUser) > 0) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public Boolean realtyRegister(User user, Realty realty) throws Exception {
		// TODO Auto-generated method stub
		Boolean flag = false;

		if (userMapper.saveUser(user) > 0
				&& realtyMapper.saveRealty(realty) > 0) {
			User newUser =userMapper.login(user.getUserName());
			newUser.setCompanyId(realtyMapper.getRealtyByName(
					realty.getCompanyName()).getId());
			if (userMapper.updateUser(newUser) > 0) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public Boolean maintenanceRegister(User user, Maintenance maintenance)
			throws Exception {
		// TODO Auto-generated method stub
		Boolean flag = false;

		if (userMapper.saveUser(user) > 0
				&& maintenanceMapper.saveMaintenance(maintenance) > 0) {
			User newUser =userMapper.login(user.getUserName());
			newUser.setCompanyId(maintenanceMapper.getMaintenanceByName(
					maintenance.getCompanyName()).getId());
			if (userMapper.updateUser(newUser) > 0) {
				flag = true;
			}
		}

		return flag;
	}
}
