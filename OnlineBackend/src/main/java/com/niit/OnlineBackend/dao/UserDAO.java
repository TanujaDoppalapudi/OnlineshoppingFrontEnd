package com.niit.OnlineBackend.dao;

import java.util.List;

import com.niit.OnlineBackend.model.Address;
import com.niit.OnlineBackend.model.User;

public interface UserDAO {

	// add an user
	boolean addUser(User user);
	User getByEmail(String email);
	
	// add an address
	boolean addAddress(Address address);
	// alternative
	 Address getBillingAddress(int userId);
	 List<Address> listShippingAddresses(int userId);
	boolean add(User user);
	User get(int id);
	
/*	
	Address getBillingAddress(User user);
	List<Address> listShippingAddresses(User user);
*/
	

}
