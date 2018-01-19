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
	public Boolean updateMaintenance(Maintenance maintenance) throws Exception {
		Boolean bool=false;
		if(maintenanceMapper.updateMaintenance(maintenance)>0){
			bool=true;
		}else{
			bool=false;
		}
		return bool;
	}
	
	@Override
	public List<User> getUserList(Integer id, String realName) throws Exception {
		return maintenanceMapper.getUserList(id, realName);
	}
	

}
