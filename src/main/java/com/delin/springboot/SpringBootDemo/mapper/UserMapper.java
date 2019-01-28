package com.delin.springboot.SpringBootDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.delin.springboot.SpringBootDemo.entity.User;
@Mapper
public interface UserMapper {
	
	
	Integer addNew(User user);
	
	Integer judgeExitsOfUsername(String uname);

	List<User> findAll();

	
}
