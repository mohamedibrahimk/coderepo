package com.ibr.storeinventory.services;

import com.ibr.storeinventory.bo.UserBO;
import com.ibr.storeinventory.services.exception.BusinessException;

public interface UserService {
	public void signUp(UserBO userBO) throws BusinessException;

	public boolean login(String emailId, String password);

}
