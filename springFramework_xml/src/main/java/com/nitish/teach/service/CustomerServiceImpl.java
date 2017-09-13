package com.nitish.teach.service;

import java.util.List;

import com.nitish.teach.dao.SpringHibernateDAO;
import com.nitish.teach.dao.SpringHibernateDAOImpl;
import com.nitish.teach.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	// Candidate for the dependency injection
	//SpringHibernateDAO springHibernateDaoClient = new SpringHibernateDAOImpl();
	
	SpringHibernateDAO springHibernateDaoClient;
	
	SpringHibernateDAO  springHibernateDAO;
	
	
	/**
	 * Default constructor
	 */
	public CustomerServiceImpl() {
		
	}
	
	
	/**
	 * Constructor Injection example
	 * @param springHibernateDao
	 */
	public CustomerServiceImpl (SpringHibernateDAO springHibernateDao) {
		this.springHibernateDaoClient = springHibernateDao;
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.nitish.learn.service.CustomerService#getAllCustomer()
	 */
	@Override
	public List<Customer> getAllCustomer() {
		return springHibernateDaoClient.getAllCustomer();
	}

	// This setter will be use by the context to set the bean 
	public void setSpringHibernateDaoClient(SpringHibernateDAO springHibernateDaoClient) {
		this.springHibernateDaoClient = springHibernateDaoClient;
	}
	
	

}
