package cn.elevator.service.elevatorInfo;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.ElevatorInfo;

public interface ElevatorInfoService {
	public List<ElevatorInfo> getElevatorList(Integer buildingId,
			String buildingName,
			Integer elevatorType,
			String elevatorCode,
			String registrationCode,
			Integer usingState,
			Integer from,
			Integer pageSize)throws Exception;
	public Integer getElevatorCount(Integer buildingId)throws Exception;
}
