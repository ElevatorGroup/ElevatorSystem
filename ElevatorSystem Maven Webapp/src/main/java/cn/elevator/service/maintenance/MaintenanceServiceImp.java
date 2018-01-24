package cn.elevator.service.maintenance;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.elevator.dao.maintenance.MaintenanceMapper;
import cn.elevator.entity.Maintenance;
import cn.elevator.entity.User;
@Service
public class MaintenanceServiceImp implements MaintenanceService{
	@Resource
	private MaintenanceMapper maintenanceMapper;
	@Override
	public Maintenance getMaintenance(Integer id, Integer userRole)
			throws Exception {
		
		return maintenanceMapper.getMaintenance(id, userRole);
	}
	
	@Override
	public List<User> getUserList(Integer id, String realName) throws Exception {
		return maintenanceMapper.getUserList(id, realName);
	}
	
	
	@Override
	public Boolean addMainUser(User user) throws Exception {
		Boolean bool=false;
		if(maintenanceMapper.addMainUser(user)>0){  
			bool=true;
		}else{
			bool=false;
		}
		return bool;
	}
	@Override
	public Maintenance getMaintenanceByName(String companyName)
			throws Exception {
		// TODO Auto-generated method stub
		return maintenanceMapper.getMaintenanceByName(companyName);
	}

	@Override
	public Boolean saveMaintenance(Maintenance maintenance) throws Exception {
		// TODO Auto-generated method stub
		Boolean falg = false;
		if (maintenanceMapper.saveMaintenance(maintenance) > 0)
			falg = true;
		return falg;
	}

	@Override
	public Boolean updateMaintenance(Maintenance maintenance) throws Exception {
		// TODO Auto-generated method stub
		Boolean falg = false;
		if (maintenanceMapper.updateMaintenance(maintenance) > 0)
			falg = true;
		return falg;
	}


	
	

}
