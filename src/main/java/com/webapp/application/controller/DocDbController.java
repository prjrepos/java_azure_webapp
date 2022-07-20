package com.webapp.application.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.dao.CustomerDaoFactory;
import com.webapp.model.Customer;
import com.webapp.model.ICustomer;

import lombok.NonNull;

@RestController
@RequestMapping("/api/1.0/docdb")
public class DocDbController {

	private static DocDbController docDbController;
    private ICustomer customer; 

	@Autowired
	public DocDbController(ICustomer customer) {
        super();
		this.customer = customer;
    }
	
    @Autowired
    public static DocDbController getInstance() {
        if (docDbController == null) {
            docDbController = new DocDbController(CustomerDaoFactory.getDao());
        }
        return docDbController;
    }

	@GetMapping("/health-check")
	public String heath_check() {
		return "I am healthy and running as azure webapp from docdb controller!";
	}

	@PostMapping("/customer")	
    public Customer createCustomer(@NonNull String name, boolean isValid) {
        Customer cust = new Customer();

        cust.setName(name);
        cust.setIsValid(isValid);
        cust.setId(UUID.randomUUID().toString());        
        return customer.createCustomer(cust);
    }

}

