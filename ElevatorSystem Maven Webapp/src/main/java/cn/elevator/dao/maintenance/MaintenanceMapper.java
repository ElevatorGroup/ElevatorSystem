package cn.elevator.dao.maintenance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Maintenance;
import cn.elevator.entity.User;

public interface MaintenanceMapper {
	public Maintenance getMaintenance(@Param("id")Integer id,@Param("userRole")Integer userRole)throws Exception;
	public Integer updateMaintenance(Maintenance maintenance)throws Exception;
	public List<User> getUserList(@Param("id")Integer id,@Param("userRole")Integer userRole)throws Exception;

}
