package com.ibr.storeinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibr.storeinventory.bo.ItemBO;
import com.ibr.storeinventory.bo.ItemCategoryBO;
import com.ibr.storeinventory.dao.ItemCategoryDao;
import com.ibr.storeinventory.dao.ItemDao;
import com.ibr.storeinventory.services.SearchItemsService;
import com.ibr.storeinventory.ui.form.SearchItemsForm;

@Controller("searchItemsController")
public class SearchItemsController {

	@Autowired
	SearchItemsService searchService;
	@Autowired
	ItemCategoryDao itemCategoryDao;
	@Autowired
	ItemDao itemDao;
	
	@RequestMapping(value="/searchitems",method=RequestMethod.GET)
	public ModelAndView showSearchPage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchItems");
		mv.getModelMap().put("itemCategories", itemCategoryDao.getAllItemCategories());
		mv.getModelMap().put("SearchItemsForm", new SearchItemsForm());
		return mv;
	}
	
	@RequestMapping(value="/searchresults",method=RequestMethod.POST)
	public ModelAndView searchItems(@ModelAttribute("SearchItemsForm") SearchItemsForm searchItemsForm)
	{
		ModelAndView mv = new ModelAndView();
		mv.getModelMap().put("SearchResults", itemDao.searchItem(searchItemsForm.getSearchCriteria(),searchItemsForm.getItemCategory()));
		mv.setViewName("SearchResults");
		return mv;
	}
	
	public List<ItemCategoryBO> getAllItemCategories()
	{
		return itemCategoryDao.getAllItemCategories();
	}
	
	public List<ItemBO> searchItem(SearchItemsForm searchItemsForm)
	{
		return itemDao.searchItem(searchItemsForm.getSearchCriteria(),searchItemsForm.getItemCategory());
	}
}
