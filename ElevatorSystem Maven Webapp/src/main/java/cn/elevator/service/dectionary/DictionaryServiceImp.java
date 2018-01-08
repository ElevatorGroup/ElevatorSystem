package cn.elevator.service.dectionary;

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
	// TODO Auto-generated method stub
	return dictionaryMapper.getUserRole(typeCode, valueId);
}
	


}
