package cn.elevator.dao.building;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Building;

public interface BuildingMapper {
	public Building getBuidingById(@Param("ID")Integer buildingId)throws Exception;
		
	/**
	 * 
	 * @param building
	 * @return
	 */
	public int saveBuilding(Building building)throws Exception;
	/**
	 * 
	 * @param building
	 * @return
	 */
	public int updateBuilding(Building building)throws Exception;
	
	public Building getBuildingByName(@Param("companyName")String companyName)throws Exception;
		
	

}
