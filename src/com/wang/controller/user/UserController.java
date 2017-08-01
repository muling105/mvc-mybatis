package com.wang.controller.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wang.service.BaseService;


@Controller
public class UserController {

	private static final String u = "user/";
	
	@Autowired
	private BaseService baseservice;
	
	@RequestMapping("user.preAdd.do")
	public String preAdd(){
		return u +"add";
	}
	
	@RequestMapping("user.doAdd.do")
	public String doAdd(User user) throws Exception{
		try {
			baseservice.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return u + "success";
	}
	
	@RequestMapping("user.getAll.do")
	public String getAll(ModelMap mp){
		List<User> list = new ArrayList<User>();
		try {
			list = baseservice.getUserAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mp.put("userList", list);
		return u + "page";
	}
	
	@RequestMapping("user.detail.do")
	public String detail(String id, ModelMap mp){
		User user = new User();
		try {
			user = baseservice.getUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mp.put("user", user);
		return u + "detail";
	}
	
}
