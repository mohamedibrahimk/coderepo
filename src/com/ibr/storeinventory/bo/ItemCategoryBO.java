package com.ibr.storeinventory.bo;

import java.io.Serializable;


public class ItemCategoryBO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int categoryId;
	private final String category;
	private final String categoryDescription;
	
	public ItemCategoryBO(int categoryId, String category, String categoryDescription)
	{
		this.categoryId = categoryId;
		this.category = category;
		this.categoryDescription = categoryDescription;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public int getCategoryId()
	{
		return this.categoryId;
	}
	
	public String getCategoryDescription()
	{
		return this.categoryDescription;
	}
}
