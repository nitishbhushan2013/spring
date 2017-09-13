package com.nitish.teach;

import java.util.List;

import com.nitish.teach.model.Customer;
import com.nitish.teach.service.CustomerService;
import com.nitish.teach.service.CustomerServiceImpl;

public class CustomerClient {

	
	public static void main(String[] args) {
		CustomerService  cllientService = new CustomerServiceImpl();
		List<Customer> customerList = cllientService.getAllCustomer();
		
		for(Customer cust : customerList) {
			System.out.println("First Name: "+ cllientService.getAllCustomer().get(0).getFirstName() );
			System.out.println("Last Name: "+ cllientService.getAllCustomer().get(0).getLastname() );
		}
	}

}
