package cn.elevator.service.realty;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.elevator.dao.realty.RealtyMapper;
import cn.elevator.entity.Realty;

@Service
public class RealtyServiceImpl implements RealtyService {
	@Resource
	private RealtyMapper realtyMapper;

	@Override
	public Realty getRealtyByName(String companyName) throws Exception {
		// TODO Auto-generated method stub
		return realtyMapper.getRealtyByName(companyName);
	}

	@Override
	public Boolean saveRealty(Realty realty) throws Exception {
		// TODO Auto-generated method stub
		Boolean falg = false;
		if (realtyMapper.saveRealty(realty) > 0)
			falg = true;
		return falg;
	}

	@Override
	public Boolean updateRealty(Realty realty) throws Exception {
		// TODO Auto-generated method stub
		Boolean falg = false;
		if (realtyMapper.updateRealty(realty) > 0)
			falg = true;
		return falg;
	}

}
