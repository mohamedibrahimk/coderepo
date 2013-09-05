package com.ibr.storeinventory.dao.impl.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibr.storeinventory.bo.UserBO;
import com.ibr.storeinventory.dao.UserDao;

@Repository
@Transactional(propagation=Propagation.MANDATORY) //to ensure that the DAO gets called strictly in the context of a transaction
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void create(UserBO user) {
		Session ss= sessionFactory.openSession();
		//ss.beginTransaction();
		ss.save(user);
		//ss.getTransaction().commit();
		ss.flush();
		ss.close();
	}

	@Override
	public UserBO getByEmailId(String emailId) {
		Session ss = sessionFactory.openSession();
		//ss.beginTransaction();
		UserBO user = (UserBO)ss.get(UserBO.class, emailId);
		//ss.getTransaction().commit();
		ss.close();
		return user;
	}
	
	

}
