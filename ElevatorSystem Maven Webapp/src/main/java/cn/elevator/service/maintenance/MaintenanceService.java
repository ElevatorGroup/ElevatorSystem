package cn.elevator.service.maintenance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Maintenance;
import cn.elevator.entity.User;

public interface MaintenanceService {
	public Maintenance getMaintenance(Integer id,Integer userRole)throws Exception;
	public Boolean updateMaintenance(Maintenance maintenance)throws Exception;
	public List<User> getUserList(Integer id,Integer userRole)throws Exception;

}
