package com.wang.mapper;

import java.util.List;
import java.util.Map;

import com.wang.controller.user.User;

public interface UserMapper {

	public void addUser(User user) throws Exception;
	
	public User getUserById(String id) throws Exception;
	
	public List<User> getUserAll() throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void updateUserByMap(Map map) throws Exception;
}
