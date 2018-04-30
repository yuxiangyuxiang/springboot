package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

@Controller
public class UserInfoController {
	
	@Resource(name="userInfoService")
	private UserInfoService userInfoService;
	
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<UserInfo> getUsers() {
		
		return userInfoService.getUsers(new HashMap<>());
	}
}
