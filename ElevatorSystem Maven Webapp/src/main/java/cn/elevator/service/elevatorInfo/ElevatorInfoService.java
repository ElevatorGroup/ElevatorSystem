package cn.elevator.service.elevatorInfo;
import java.util.List;

import cn.elevator.entity.ElevatorInfo;

public interface ElevatorInfoService {
	public List<ElevatorInfo> getElevatorList(Integer buildingId)throws Exception;
}
