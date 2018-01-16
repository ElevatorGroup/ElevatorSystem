package cn.elevator.service.elevatorInfo;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import cn.elevator.dao.elevatorInfo.ElevatorInfoMapper;
import cn.elevator.entity.Building;
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
			Integer elevatorType, String elevatorCode, String registrationCode,
			Integer registrationStatus, Integer usingState, Integer from,
			Integer pageSize) throws Exception {
		
		return elevatorInfoMapper.getBuildingElevatorList(buildingId, elevatorType, elevatorCode, registrationCode, registrationStatus, usingState, from, pageSize);
	}


	@Override
	public List<ElevatorInfo> getRealtyElevatorList(Integer maintenanceId,
			Integer realtyId, Integer elevatorType, String elevatorCode,
			String registrationCode, Integer registrationStatus,
			Integer usingState, Integer from, Integer pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		return elevatorInfoMapper.getRealtyElevatorList(maintenanceId, realtyId, elevatorType, elevatorCode, registrationCode, registrationStatus, usingState, from, pageSize);
	}


	@Override
	public List<Building> getBuildingName(Integer userRole, Integer id) {
		// TODO Auto-generated method stub
		return elevatorInfoMapper.getBuildingName(userRole, id);
	}


	
	
}
