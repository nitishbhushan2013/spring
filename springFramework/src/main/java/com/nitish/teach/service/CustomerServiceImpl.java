package com.nitish.teach.service;

import java.util.List;

import com.nitish.teach.dao.SpringHibernateDAO;
import com.nitish.teach.dao.SpringHibernateDAOImpl;
import com.nitish.teach.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	SpringHibernateDAO springHibernateDaoClient = new SpringHibernateDAOImpl();
	
	/* (non-Javadoc)
	 * @see com.nitish.learn.service.CustomerService#getAllCustomer()
	 */
	@Override
	public List<Customer> getAllCustomer() {
		return springHibernateDaoClient.getAllCustomer();
	}

}
