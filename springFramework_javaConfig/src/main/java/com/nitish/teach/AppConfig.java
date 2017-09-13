package com.nitish.teach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nitish.teach.dao.SpringHibernateDAO;
import com.nitish.teach.dao.SpringHibernateDAOImpl;
import com.nitish.teach.service.CustomerService;
import com.nitish.teach.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.nitish.teach"})
public class AppConfig {

	/*@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.setSpringHibernateDaoClient(getSpringHibernateDAO());
		return customerService;
	}*/
	
	/*@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl(getSpringHibernateDAO());
		return customerService;
	}
	
	
	@Bean
	public SpringHibernateDAO getSpringHibernateDAO() {
		return new SpringHibernateDAOImpl();
	}*/
}
