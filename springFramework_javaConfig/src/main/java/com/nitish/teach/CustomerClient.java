package com.nitish.teach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nitish.teach.service.CustomerService;
import com.nitish.teach.service.CustomerServiceImpl;

public class CustomerClient {

	
	public static void main(String[] args) {
		//CustomerService  cllientService = new CustomerServiceImpl();
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService = appContext.getBean("customerService", CustomerServiceImpl.class);
			
		System.out.println("First Name: "+ customerService.getAllCustomer().get(0).getFirstName() );
		System.out.println("Last Name: "+ customerService.getAllCustomer().get(0).getLastname() );
	}

}
