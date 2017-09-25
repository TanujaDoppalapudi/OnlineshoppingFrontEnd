package com.niit.OnlineBackend.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.OnlineBackend.dao.CategoryDAO;
import com.niit.OnlineBackend.model.Category;


public class CategoryTestcases
{
private static AnnotationConfigApplicationContext context;
private static CategoryDAO categoryDAO;
private Category category;

@BeforeClass
public static void intit()
{
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.OnlineBackend");
	context.refresh();
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
}
@Test
public void testAddCategory()
{
	category=new Category();
	category.setName("television");
	category.setDescription("desrcription about tv");
	category.setImageURL("cat_106.png");
	assertEquals("successfully added a category inside table",true,categoryDAO.add(category));
}
/*
@Test 
public void testGetCategory()
{
	category=categoryDAO.get(3);
	assertEquals("Sucessfully fetched a single category from the table!","Telivision",category.getName());
	}
@Test
public void testUpdateCategory()
{
	category=categoryDAO.get(3);
	category.setName("TV");
	assertEquals("Sucessfully updated  a single category in the table!",true,categoryDAO.update(category));
}
@Test
public void testDeleteCategory()
{
	category=categoryDAO.get(3);
	
	assertEquals("Sucessfully deleted  a single category in the table!",true,categoryDAO.delete(category));
}
@Test
public void testListCategory()
{
	
	assertEquals("Sucessfully fetched the list of  categories from the table!",3,categoryDAO.list().size());
}
*/
}






