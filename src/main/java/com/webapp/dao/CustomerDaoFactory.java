package com.webapp.dao;

import org.springframework.stereotype.Component;

import com.webapp.model.ICustomer;

@Component
public class CustomerDaoFactory {
    private static ICustomer customerDao = new DocDbCustomerService();

    public static ICustomer getDao() {
        return customerDao;
    }
}
