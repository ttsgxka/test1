package com.tedu.sp01.service;

import com.tedu.sp01.pojp.User;

public interface UserService {
	
	/**
	 * 获取用户数据
	 * */
	User getUser(Integer id);
	/**
	 * 
	 * */
	void addScore(Integer id, Integer score);
}
