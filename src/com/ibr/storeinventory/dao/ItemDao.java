package com.ibr.storeinventory.dao;

import java.util.List;

import com.ibr.storeinventory.bo.ItemBO;

public interface ItemDao {

	List<ItemBO> searchItem(String searchCriteria, String itemCategory);

}
