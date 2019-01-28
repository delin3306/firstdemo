package com.delin.springboot.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delin.springboot.SpringBootDemo.entity.User;
import com.delin.springboot.SpringBootDemo.service.IUserService;
import com.delin.springboot.SpringBootDemo.util.ResponseResult;

@RestController 	//responseBody+Controller
@RequestMapping("/user")
public class UserController {
	
	private IUserService userService;
	
	@PostMapping("/reg")
	public ResponseResult<Void> handleReg(User user){
		userService.reg(user);
		System.err.println("注册成功");
		return new ResponseResult<>(1,"注册成功！");
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseResult<Void> handleException(Exception e){
		System.err.println("注册失败");
		return new ResponseResult<>(2,e);
	}
}
