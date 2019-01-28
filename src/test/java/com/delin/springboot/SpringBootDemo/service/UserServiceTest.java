package com.delin.springboot.SpringBootDemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.delin.springboot.SpringBootDemo.entity.User;
import com.delin.springboot.SpringBootDemo.service.impl.UserServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
	@Autowired
	UserServiceImpl userService;
	
	@Test
	public void reg() {
		User user = new User();
		user.setId(36);
		user.setUname("huhua");
		user.setPwd("sdfghj");
		try {
			userService.reg(user);
			System.err.println("注册成功");
		}catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
