package cn.elevator.dao.elevatorInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Building;
import cn.elevator.entity.ElevatorInfo;

public interface  ElevatorInfoMapper {
	
	public List<Building> getBuildingName(@Param("userRole")Integer userRole,
			@Param("id")Integer id);
	
	
	
	
	public List<ElevatorInfo> getBuildingElevatorList(
			@Param("buildingId")Integer buildingId,
			@Param("elevatorType")Integer elevatorType,
			@Param("elevatorCode")String elevatorCode,
			@Param("registrationCode")String registrationCode,
			@Param("registrationStatus")Integer registrationStatus,
			@Param("usingState")Integer usingState,
			@Param("from")Integer from,
			@Param("pageSize")Integer pageSize)throws Exception;
	
	public List<ElevatorInfo> getRealtyElevatorList(
			@Param("maintenanceId")Integer maintenanceId,
			@Param("realtyId")Integer realtyId,
			@Param("elevatorType")Integer elevatorType,
			@Param("elevatorCode")String elevatorCode,
			@Param("registrationCode")String registrationCode,
			@Param("registrationStatus")Integer registrationStatus,
			@Param("usingState")Integer usingState,
			@Param("from")Integer from,
			@Param("pageSize")Integer pageSize)throws Exception;
	public Integer getElevatorCount(@Param("buildingId")Integer buildingId)throws Exception;

	public ElevatorInfo getElevatorById(@Param("id")Integer id)throws Exception;
	public Integer delElevatorById(@Param("id")Integer id)throws Exception;
	//给电梯修改维保人员
	public Integer updateElevatorById(
			@Param("maintenancePersonId")String maintenancePersonId,
			@Param("id")Integer id
			)throws Exception;

}
