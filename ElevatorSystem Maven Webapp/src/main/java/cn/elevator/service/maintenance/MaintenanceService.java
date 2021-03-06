package cn.elevator.service.maintenance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Maintenance;
import cn.elevator.entity.User;

public interface MaintenanceService {
	public Maintenance getMaintenance(Integer id,Integer userRole)throws Exception;
	public List<User> getUserList(Integer id,String realName)throws Exception;
	public Boolean addMainUser(User user)throws Exception;
	
	//维保公司注册
		public Maintenance getMaintenanceByName(String companyName)
				throws Exception;

		public Boolean saveMaintenance(Maintenance maintenance) throws Exception;

		public Boolean updateMaintenance(Maintenance maintenance) throws Exception;
}
