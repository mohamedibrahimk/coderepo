package com.ibr.storeinventory.ui.form;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("searchItemsForm")
public class SearchItemsForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String searchCriteria;
	private String itemCategory;
	
	public String getSearchCriteria() {
		return searchCriteria;
	}
	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}


}
