package com.ibr.storeinventory.bo;


public class ItemSearchCriteriaBO {

	private final String searchCriteria;
	private final String itemCategory;
	
	public ItemSearchCriteriaBO(String searchCriteria, String itemCategory)
	{
		this.itemCategory = itemCategory;
		this.searchCriteria = searchCriteria;		
	}
	
	public String getSearchCriteria()
	{
		return this.searchCriteria;
	}
	
	public String getItemCategory()
	{
		return this.itemCategory;
	}
	
}
