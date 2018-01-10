package cn.elevator.service.dectionary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Dictionary;

public interface DictionaryService {
	public Dictionary getUserRole(String typeCode,
			Integer valueId);
	
	public List<Dictionary> getElevatorType();
	public List<Dictionary> getRegistrationStatus();
	public List<Dictionary> getUsingState();

}
