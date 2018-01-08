package cn.elevator.dao.dictionary;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Dictionary;

public interface DictionaryMapper {
	public Dictionary getUserRole(@Param(value="typeCode")String typeCode,
			@Param(value="valueId")Integer valueId);
}
