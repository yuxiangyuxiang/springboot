package com.example.demo.service.imp;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.imp.UserInfoDao;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImp implements UserInfoService {
	@Resource(name="userInfoDao")
	private UserInfoDao userInfoDao;

	@Override
	public List<UserInfo> getUsers(Map<String, Object> map) {
		
		return userInfoDao.userPage(map);
	}
	

}
