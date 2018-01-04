package cn.elevator.dao.elevatorInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.ElevatorInfo;

public interface  ElevatorInfoMapper {
	public List<ElevatorInfo> getElevatorList(@Param("buildingId")Integer buildingId)throws Exception;
}
