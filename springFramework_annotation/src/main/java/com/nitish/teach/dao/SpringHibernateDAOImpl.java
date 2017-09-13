package com.nitish.teach.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nitish.teach.model.Customer;

@Repository("springHibernateDAO")
public class SpringHibernateDAOImpl implements SpringHibernateDAO {
	
	public List<Customer> getAllCustomer() {
		
		List<Customer> customers = new ArrayList<Customer>();
		Customer cust = new Customer();
		cust.setFirstName("Nitish");
		cust.setLastname("Bhushan");
		customers.add(cust);
		return customers;
	}

}
