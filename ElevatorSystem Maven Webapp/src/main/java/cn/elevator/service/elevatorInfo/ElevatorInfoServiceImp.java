package cn.elevator.service.elevatorInfo;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import cn.elevator.dao.elevatorInfo.ElevatorInfoMapper;
import cn.elevator.entity.ElevatorInfo;

@Service
public class ElevatorInfoServiceImp implements ElevatorInfoService {
	@Resource
	private ElevatorInfoMapper elevatorInfoMapper;

	@Override
	public List<ElevatorInfo> getElevatorList(Integer buildingId)
			throws Exception {
		
		return (List<ElevatorInfo>) elevatorInfoMapper.getElevatorList(buildingId);

	}

}
