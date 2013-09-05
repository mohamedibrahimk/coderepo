package com.ibr.storeinventory.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibr.storeinventory.bo.ItemBO;
import com.ibr.storeinventory.bo.ItemSearchCriteriaBO;


public interface SearchItemsService {
	public List<ItemBO> searchItem(ItemSearchCriteriaBO searchCriteria);

}
