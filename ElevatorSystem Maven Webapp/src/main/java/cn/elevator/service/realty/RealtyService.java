package cn.elevator.service.realty;


import cn.elevator.entity.Realty;

public interface RealtyService {
	public Realty getRealtyByName(String companyName)throws Exception;
	
	public Boolean saveRealty(Realty realty)throws Exception;
	
	public Boolean updateRealty(Realty realty)throws Exception;
}
