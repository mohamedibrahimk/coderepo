package com.ibr.storeinventory.dao.impl.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibr.storeinventory.bo.ItemBO;
import com.ibr.storeinventory.dao.ItemDao;

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class ItemDaoImpl implements ItemDao {
	
	@Autowired
	SessionFactory sessionFactory; 

	@Override
	public List<ItemBO> searchItem(String searchCriteria, String itemCategory) {
		Session session = sessionFactory.openSession();
		Query query = 
		
	}

}
