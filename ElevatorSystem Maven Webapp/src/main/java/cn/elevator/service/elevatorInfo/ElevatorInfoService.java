package cn.elevator.service.elevatorInfo;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Building;
import cn.elevator.entity.ElevatorInfo;

public interface ElevatorInfoService {
	public List<Building> getBuildingName(Integer userRole,
			Integer id);
	
	
	public List<ElevatorInfo> getElevatorList(
			Integer buildingId,
			Integer elevatorType,
			String elevatorCode,
			String registrationCode,
			Integer registrationStatus,
			Integer usingState,
			Integer from,
			Integer pageSize)throws Exception;
	
	public List<ElevatorInfo> getRealtyElevatorList(
			Integer maintenanceId,
			Integer realtyId,
			Integer elevatorType,
			String elevatorCode,
			String registrationCode,
			Integer registrationStatus,
			Integer usingState,
			Integer from,
			Integer pageSize)throws Exception;
	
	public Integer getElevatorCount(Integer buildingId)throws Exception;
	
	public ElevatorInfo getElevatorById(Integer id)throws Exception;
}
