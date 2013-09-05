package com.ibr.storeinventory.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="item")
public class ItemBO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private final int itemId;
	private final String itemName;
	private final String itemCategory;
	private final String itemDescription;
	private final int itemQuantity;
	
	private ItemBO(Builder builder)
	{
		this.itemId = builder.itemId;
		this.itemName = builder.itemName;
		this.itemCategory = builder.itemCategory;
		this.itemDescription = builder.itemDescription;
		this.itemQuantity = builder.itemQuantity;
	}
	
	
	public int getItemId()
	{
		return this.itemId;
	}
	
	public String getItemName()
	{
		return this.itemName;
	}
	
	public String getItemCategory()
	{
		return this.itemCategory;
	}
	
	public String getItemDescription()
	{
		return this.itemDescription;
	}
	
	public int getItemQuantity()
	{
		return this.itemQuantity;
	}
	
	
	//builder for creating new instances of ItemBO
	public static class Builder
	{
		private final int itemId;
		private final String itemName;
		private final String itemCategory;
		private String itemDescription;
		private int itemQuantity;
		
		public Builder(int itemId, String itemName, String itemCategory)
		{
			this.itemId = itemId;
			this.itemName = itemName;
			this.itemCategory = itemCategory;
		}
		
		public Builder itemDescription(String itemDescription)
		{
			this.itemDescription = itemDescription;
			return this;
		}
		
		public Builder itemQuantity(int itemQuantity)
		{
			this.itemQuantity = itemQuantity;
			return this;
		}
		
		public ItemBO build()
		{
			return new ItemBO(this);
		}
	}
}
