package it.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.com.dao.UserMapper;
import it.com.entity.User;

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/get/{id}")
	public User get(@PathVariable Integer id){
		User user = userMapper.getOne(id);
		return user;
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		userMapper.delete(id);
		return "delete cussess";
	}
}
