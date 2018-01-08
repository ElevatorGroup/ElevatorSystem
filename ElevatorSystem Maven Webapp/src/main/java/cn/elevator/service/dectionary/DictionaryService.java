package cn.elevator.service.dectionary;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Dictionary;

public interface DictionaryService {
	public Dictionary getUserRole(String typeCode,
			Integer valueId);

}
