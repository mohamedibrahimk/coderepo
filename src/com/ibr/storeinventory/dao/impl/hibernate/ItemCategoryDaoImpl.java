package com.ibr.storeinventory.dao.impl.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibr.storeinventory.bo.ItemCategoryBO;
import com.ibr.storeinventory.dao.ItemCategoryDao;

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class ItemCategoryDaoImpl implements ItemCategoryDao {

	@Override
	public List<ItemCategoryBO> getAllItemCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
