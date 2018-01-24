package cn.elevator.dao.realty;

import org.apache.ibatis.annotations.Param;

import cn.elevator.entity.Realty;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:32:36
 */
public interface RealtyMapper {
	
	public int saveRealty(Realty realty)throws Exception;

	public int updateRealty(Realty realty)throws Exception;
	
	public Realty getRealtyByName(@Param("companyName")String companyName)throws Exception;
	
}
