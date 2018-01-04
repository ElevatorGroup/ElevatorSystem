package cn.elevator.dao.user;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.elevator.entity.User;

public interface UserMapper {
	/**
	 * 通过userName获取User
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public User login(@Param("userName")String userName)throws Exception;
	
	
}
