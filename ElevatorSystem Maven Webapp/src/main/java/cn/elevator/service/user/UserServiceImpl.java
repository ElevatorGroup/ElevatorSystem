package cn.elevator.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.elevator.dao.user.UserMapper;
import cn.elevator.entity.User;


@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	
	public User login(String userName) throws Exception {
	
		User user = null;
		user = userMapper.login(userName);
		return user;
	}


}
