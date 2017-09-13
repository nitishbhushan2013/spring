package com.nitish.teach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nitish.teach.service.CustomerService;

public class CustomerClient {

	
	public static void main(String[] args) {
		//CustomerService  cllientService = new CustomerServiceImpl();
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
			
		System.out.println("First Name: "+ customerService.getAllCustomer().get(0).getFirstName() );
		System.out.println("Last Name: "+ customerService.getAllCustomer().get(0).getLastname() );
	}

}
