package com.delin.springboot.SpringBootDemo.mapper;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.delin.springboot.SpringBootDemo.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void addnew() {
		User user = new User();
		//user.setId(35);
		user.setUname("boot");
		user.setPwd("8888");
		Integer rows = userMapper.addNew(user);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void judgeExitsOfUsername() {
		String uname = "root";
		Integer count = userMapper.judgeExitsOfUsername(uname);
		System.err.println(count==1?"此用户名已经被使用":"用户不存在");
	}
	
	@Test
	public void listUser() {
		List<User> users = userMapper.findAll();
		for(User user:users) {
			System.err.println(user);
		}
	}

}
