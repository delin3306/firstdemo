package com.delin.springboot.SpringBootDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delin.springboot.SpringBootDemo.entity.User;
import com.delin.springboot.SpringBootDemo.mapper.UserMapper;
import com.delin.springboot.SpringBootDemo.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public void reg(User user) {
		// TODO Auto-generated method stub
		String uname = user.getUname();
		if(userMapper.judgeExitsOfUsername(uname)==0) {
			userMapper.addNew(user);
		}else {
			throw new RuntimeException("注册失败! 用户名["+uname+"]已经被注册");
		}
		
		
	}

}
