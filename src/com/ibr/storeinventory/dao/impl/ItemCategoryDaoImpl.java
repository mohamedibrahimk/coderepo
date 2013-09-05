package com.ibr.storeinventory.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibr.storeinventory.bo.ItemBO;
import com.ibr.storeinventory.bo.ItemCategoryBO;
import com.ibr.storeinventory.bo.ItemCategoryBO;
import com.ibr.storeinventory.dao.ItemCategoryDao;

@Repository
public class ItemCategoryDaoImpl implements ItemCategoryDao {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<ItemCategoryBO> getAllItemCategories() {
		List<ItemCategoryBO> itemCategories = new ArrayList<ItemCategoryBO>(); 
		try
		{
			String getAllCategoriesSql = "select category_id, category_name, category_description from item_category";
			Connection conn = dataSource.getConnection();
			PreparedStatement pstat = conn.prepareStatement(getAllCategoriesSql);
			ResultSet rs = pstat.executeQuery();
			while(rs.next())
			{
				itemCategories.add(new ItemCategoryBO(rs.getInt("category_id"),rs.getString("category_name"),rs.getString("category_description")));
			}	
		}
		catch(SQLException sqex)
		{
			sqex.printStackTrace();
		}
		
		return itemCategories;
	}

}
