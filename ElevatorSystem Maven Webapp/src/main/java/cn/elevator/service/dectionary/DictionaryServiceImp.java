package cn.elevator.service.dectionary;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.elevator.dao.dictionary.DictionaryMapper;
import cn.elevator.entity.Dictionary;
@Service
public class DictionaryServiceImp implements DictionaryService {
@Resource
private DictionaryMapper dictionaryMapper;

@Override
public Dictionary getUserRole(String typeCode, Integer valueId) {
	return dictionaryMapper.getUserRole(typeCode, valueId);
}



@Override
public List<Dictionary> getElevatorType() {
	return dictionaryMapper.getElevatorType();
}

@Override
public List<Dictionary> getRegistrationStatus() {
	return dictionaryMapper.getRegistrationStatus();
}

@Override
public List<Dictionary> getUsingState() {
	return dictionaryMapper.getUsingState();
}
	


}
