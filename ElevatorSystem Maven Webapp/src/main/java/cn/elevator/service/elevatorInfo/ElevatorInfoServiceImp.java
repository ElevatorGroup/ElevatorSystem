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


	@Override
	public ElevatorInfo getElevatorById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return elevatorInfoMapper.getElevatorById(id);
	}


	@Override
	public Boolean delElevatorById(Integer id) throws Exception {
		Boolean bool=false;
		if(elevatorInfoMapper.delElevatorById(id)>0){
			bool=true;
		}else{
			bool=false;
		}
		return bool;
	}


	@Override
	public Boolean updateElevatorById(String maintenancePersonId, Integer id)
			throws Exception {
		Boolean bool=false;
		if(elevatorInfoMapper.updateElevatorById(maintenancePersonId, id)>0){
			bool=true;
		}
		return bool;
	}



	

	
	
}
