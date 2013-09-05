package com.ibr.storeinventory.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibr.storeinventory.bo.UserBO;
import com.ibr.storeinventory.dao.UserDao;
import com.ibr.storeinventory.services.UserService;
import com.ibr.storeinventory.services.exception.BusinessException;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void signUp(UserBO userBO) throws BusinessException{
			userDao.create(userBO);		
	}

	@Override
	public boolean login(String emailId, String password) {
		UserBO user = userDao.getByEmailId(emailId);
		if(user!=null && user.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}

}
