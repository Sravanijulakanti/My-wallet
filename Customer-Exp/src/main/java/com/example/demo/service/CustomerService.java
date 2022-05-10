package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;


	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		Customer vo= new Customer();
		vo.setCustomerId(customer.getCustomerId());
		vo.setPasscode(customer.getPasscode());
		return vo;
		
		
	}

}
