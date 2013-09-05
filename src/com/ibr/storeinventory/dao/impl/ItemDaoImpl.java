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
import com.ibr.storeinventory.dao.ItemDao;

@Repository
public class ItemDaoImpl implements ItemDao {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<ItemBO> searchItem(String searchCriteria, String itemCategory) {
		
		String searchItemSql = "select a.item_id, a.item_name, a.item_description,a.quantity, b.category_name from " +
				"item a, item_category b where a.item_name like ? and a.item_category_id=? and a.item_category_id=b.category_id";
		List<ItemBO> items = new ArrayList<ItemBO>();
		try{
			Connection conn = dataSource.getConnection();
			PreparedStatement pstatement = conn.prepareStatement(searchItemSql);
			pstatement.setString(1, searchCriteria+"%");
			pstatement.setString(2, itemCategory);
			ResultSet rs = pstatement.executeQuery();
			while(rs.next())
			{
				items.add(new ItemBO.Builder(rs.getInt("a.item_id"),rs.getString("a.item_name"),rs.getString("b.category_name"))
				.itemDescription(rs.getString("a.item_description")).itemQuantity(rs.getInt("a.quantity")).build());
			}
		}
		catch(SQLException sqex)
		{
			sqex.printStackTrace();
		}
		return items;
	}
}
