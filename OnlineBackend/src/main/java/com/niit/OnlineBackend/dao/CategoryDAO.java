package com.niit.OnlineBackend.dao;

import java.util.List;


import com.niit.OnlineBackend.model.Category;

public interface CategoryDAO 
{
  List<Category> list();
  
  boolean add(Category category);
  
  Category get(int id);
  
  boolean update(Category category);
  boolean delete(Category category);
  
}