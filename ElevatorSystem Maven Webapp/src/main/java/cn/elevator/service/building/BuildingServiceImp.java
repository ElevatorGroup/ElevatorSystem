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

}
