package com.example.demo.dao.imp;

import java.util.List;
import java.util.Map;

import com.example.demo.dao.BaseDao;
import com.example.demo.model.UserInfo;

public interface UserInfoDao extends BaseDao<UserInfo> {
	
	List<UserInfo> userPage(Map<String,Object> map);
}
