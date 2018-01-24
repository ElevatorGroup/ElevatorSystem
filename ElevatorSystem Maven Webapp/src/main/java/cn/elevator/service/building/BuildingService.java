package cn.elevator.service.building;



import cn.elevator.entity.Building;

public interface BuildingService {
	public Building getBuidingById(Integer buildingId)throws Exception;
	/**
	 * 
	 * @param building
	 * @return
	 */
	public Boolean saveBuilding(Building building)throws Exception;
	/**
	 * 
	 * @param building
	 * @return
	 */
	public Boolean updateBuilding(Building building)throws Exception;

	public Building getBuildingByName(String companyName)throws Exception;
}
