package com.nitish.teach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.teach.dao.SpringHibernateDAO;
import com.nitish.teach.dao.SpringHibernateDAOImpl;
import com.nitish.teach.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired //1. Autowired at member variable. #preferred approach
	SpringHibernateDAO springHibernateDaoClient;
	
	public CustomerServiceImpl() {	
	}
	
	//@Autowired //3. constructor Injection
	public CustomerServiceImpl(SpringHibernateDAO springHibernateDaoClient) {
		this.springHibernateDaoClient = springHibernateDaoClient;
	}

	public List<Customer> getAllCustomer() {
		return springHibernateDaoClient.getAllCustomer();
	}

	//@Autowired //2. Setter Injection
	public void setSpringHibernateDaoClient(SpringHibernateDAO springHibernateDaoClient) {
		this.springHibernateDaoClient = springHibernateDaoClient;
	}
	
	

}
