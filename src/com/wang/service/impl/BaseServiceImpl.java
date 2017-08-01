package com.wang.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.wang.controller.user.User;
import com.wang.mapper.UserMapper;
import com.wang.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService {
	
	@Resource
	private SqlSession sqlSession;
	
	@Resource
	private UserMapper userMapper;

	@Override
	public void addUser(User user) throws Exception{
		//UserMapper userMapper = sqlSession.getMapper(UserMapper.class); 
		
		userMapper.addUser(user);
		
		User user2 = userMapper.getUserById("06f4efcf701911e7a7f4b083fe84312b");
		user2.setAge(20);
		userMapper.updateUser(user2);
		
		Map map = new HashMap();
		map.put("id", "0fdf270e701011e7a7f4b083fe84312b");
		map.put("sex", "女");
		userMapper.updateUserByMap(map);
	}

	@Override
	public User getUserById(String id) throws Exception{
		//UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user = userMapper.getUserById(id);
		return user;
	}
	
	@Override
	public List<User> getUserAll() throws Exception{
		//UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = new ArrayList<User>();
		list = userMapper.getUserAll();
		return list;
	}

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
