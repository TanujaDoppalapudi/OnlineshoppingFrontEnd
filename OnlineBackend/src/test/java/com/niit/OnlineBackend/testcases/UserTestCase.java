package com.niit.OnlineBackend.testcases;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.OnlineBackend.dao.UserDAO;
import com.niit.OnlineBackend.model.User;

public class UserTestCase 
{
	
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	
	/*private Cart cart = null;
	private Address address = null;
	*/
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("xxxxshoppingbackend");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	

	
}

