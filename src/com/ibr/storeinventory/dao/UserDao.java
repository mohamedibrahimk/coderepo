package com.ibr.storeinventory.dao;

import com.ibr.storeinventory.bo.UserBO;

public interface UserDao {
	
	public void create(UserBO user);

	public UserBO getByEmailId(String emailId);
}
