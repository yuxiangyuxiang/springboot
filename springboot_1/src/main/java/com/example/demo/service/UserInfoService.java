package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.model.UserInfo;

public interface UserInfoService {
	List<UserInfo> getUsers(Map<String, Object> map);
}
