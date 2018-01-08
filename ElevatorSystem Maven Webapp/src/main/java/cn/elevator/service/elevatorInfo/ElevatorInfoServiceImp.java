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
	public Integer getElevatorCount(Integer buildingId) throws Exception {
		// TODO Auto-generated method stub
		return elevatorInfoMapper.getElevatorCount(buildingId);
	}

	@Override
	public List<ElevatorInfo> getElevatorList(Integer buildingId,
			String buildingName, Integer elevatorType, String elevatorCode,
			String registrationCode, Integer usingState, Integer from,
			Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return (List<ElevatorInfo>)elevatorInfoMapper.getElevatorList(buildingId, buildingName, elevatorType, elevatorCode, registrationCode, usingState, from, pageSize);
	}

	
}
