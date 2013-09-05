package com.ibr.storeinventory.dao;

import java.util.List;

import com.ibr.storeinventory.bo.ItemBO;
import com.ibr.storeinventory.bo.ItemCategoryBO;

public interface ItemCategoryDao {

	public List<ItemCategoryBO> getAllItemCategories();

}
