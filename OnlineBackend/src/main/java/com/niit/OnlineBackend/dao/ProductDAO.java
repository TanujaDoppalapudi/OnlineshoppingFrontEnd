package com.niit.OnlineBackend.dao;

import java.util.List;
import com.niit.OnlineBackend.model.Product;

public interface ProductDAO
{
	
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	
	//business methods
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
	boolean upadate(Product product);
	
	

}
