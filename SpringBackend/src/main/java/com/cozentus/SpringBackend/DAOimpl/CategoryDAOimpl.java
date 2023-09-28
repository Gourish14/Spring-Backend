package com.cozentus.SpringBackend.DAOimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cozentus.SpringBackend.DAO.CategoryDAO;
import com.cozentus.SpringBackend.Model.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO{

	private static final List<Category> categories = new ArrayList<>();
			
	static {
		Category c1 = new Category();
		c1.setId(1);
		c1.setName("Speaker");
		c1.setDescription("Nice Boat Speaker");
		c1.setImage_url("boat.jpg");
		categories.add(c1);
		
		Category c2 = new Category();
		c2.setId(2);
		c2.setName("Headphone");
		c2.setDescription("Nice Jbl Headphone");
		c2.setImage_url("jbl.jpg");
		categories.add(c2);
		
		Category c3 = new Category();
		c3.setId(3);
		c3.setName("TV");
		c3.setDescription("Nice Onida TV");
		c3.setImage_url("onida.jpg");
		categories.add(c3);
		
		Category c4 = new Category();
		c4.setId(4);
		c4.setName("Shoes");
		c4.setDescription("Nice nike shoes");
		c4.setImage_url("nike.jpg");
		categories.add(c4);
		
		Category c5 = new Category();
		c5.setId(5);
		c5.setName("Laptop");
		c5.setDescription("Nice dell laptop");
		c5.setImage_url("dell.jpg");
		categories.add(c5);
	}

	@Override
	public List<Category> lists() {
		// TODO Auto-generated method stub
		return categories;
	}
}