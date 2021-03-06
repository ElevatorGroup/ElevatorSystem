package cn.elevator.dao.maintenance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Maintenance;
import cn.elevator.entity.User;

public interface MaintenanceMapper {
	public Maintenance getMaintenance(@Param("id")Integer id,@Param("userRole")Integer userRole)throws Exception;
	
	public List<User> getUserList(@Param("id")Integer id,@Param("realName")String realName)throws Exception;
	public Integer addMainUser(User user)throws Exception;
	public int saveMaintenance(Maintenance maintenance)throws Exception;

	public int updateMaintenance(Maintenance maintenance)throws Exception;
	
	public Maintenance getMaintenanceByName(@Param("companyName")String companyName)throws Exception;

}
