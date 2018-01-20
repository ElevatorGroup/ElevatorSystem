package cn.elevator.dao.building;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Building;

public interface BuildingMapper {
	public Building getBuidingById(@Param("ID")Integer buildingId)throws Exception;
		
	

}
