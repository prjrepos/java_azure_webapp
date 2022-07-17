package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.NonNull;

import com.example.model.Customer;
import com.example.model.ICustomer;

public class CustomerServices implements ICustomer {
    private final Map<String, Customer> customerMap;

    public CustomerServices() {
        customerMap = new HashMap<String, Customer>();
    }

    @Override
    public Customer createCustomer(@NonNull Customer customer) {
        if (customer.getId() == null || customer.getId().isEmpty()) {
            customer.setId(generateId());
        }        
        customerMap.put(customer.getId(), customer);
        return customer;
    }

    @Override
    public Customer readCustomer(@NonNull String id) {
        return customerMap.get(id);
    }

    @Override
    public List<Customer> readCustomers() {
        return new ArrayList<Customer>(customerMap.values());
    }

    @Override
    public Customer updateCustomer(String id, boolean isValid) {
        customerMap.get(id).setIsValid(isValid);
        return customerMap.get(id);
    }

    @Override
    public boolean deleteCustomer(@NonNull String id) {
        customerMap.remove(id);
        return true;
    }

    private String generateId() {
        return new Integer(customerMap.size()).toString();
    }
}