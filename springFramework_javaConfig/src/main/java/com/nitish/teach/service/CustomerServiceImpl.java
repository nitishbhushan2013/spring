package com.nitish.teach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.teach.dao.SpringHibernateDAO;
import com.nitish.teach.dao.SpringHibernateDAOImpl;
import com.nitish.teach.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	SpringHibernateDAO springHibernateDaoClient;
	
	public CustomerServiceImpl() {	
	}
	
	//2. constructor injection 
	/*public CustomerServiceImpl(SpringHibernateDAO springHibernateDAO) {	
		this.springHibernateDaoClient = springHibernateDAO;
	}*/
	
	public List<Customer> getAllCustomer() {
		return springHibernateDaoClient.getAllCustomer();
	}

	

	// 1. Setter Injection 
	
	/*public void setSpringHibernateDaoClient(SpringHibernateDAO springHibernateDaoClient) {
		this.springHibernateDaoClient = springHibernateDaoClient;
	}*/
	
	
	

}
