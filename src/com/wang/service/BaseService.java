package com.wang.service;

import java.util.List;

import com.wang.controller.user.User;

public interface BaseService {

	public void addUser(User user) throws Exception;
	
	public User getUserById(String id) throws Exception;
	
	public List<User> getUserAll() throws Exception;
	
}
