package cn.elevator.service.building;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.elevator.dao.building.BuildingMapper;
import cn.elevator.entity.Building;
@Service
public class BuildingServiceImp implements BuildingService{
	@Resource
	private BuildingMapper buildingMapper;
	@Override
	public Building getBuidingById(Integer buildingId) throws Exception {
		
		return buildingMapper.getBuidingById(buildingId);
	}
	@Override
	public Boolean saveBuilding(Building building) throws Exception {
		// TODO Auto-generated method stub
		Boolean flag = false;
		if (buildingMapper.saveBuilding(building) > 0)
			flag = true;
		return flag;
	}

	@Override
	public Boolean updateBuilding(Building building) throws Exception {
		// TODO Auto-generated method stub
		Boolean flag = false;
		if (buildingMapper.updateBuilding(building) > 0)
			flag = true;
		return flag;
	}

	@Override
	public Building getBuildingByName(String companyName) throws Exception {
		// TODO Auto-generated method stub
		return buildingMapper.getBuildingByName(companyName);
	}
}
