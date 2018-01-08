package cn.elevator.dao.elevatorInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.ElevatorInfo;

public interface  ElevatorInfoMapper {
	public List<ElevatorInfo> getElevatorList(@Param("buildingId")Integer buildingId,
			@Param("buildingName")String buildingName,
			@Param("elevatorType")Integer elevatorType,
			@Param("elevatorCode")String elevatorCode,
			@Param("registrationCode")String registrationCode,
			@Param("usingState")Integer usingState,
			@Param("from")Integer from,
			@Param("pageSize")Integer pageSize)throws Exception;
	public Integer getElevatorCount(@Param("buildingId")Integer buildingId)throws Exception;
}
