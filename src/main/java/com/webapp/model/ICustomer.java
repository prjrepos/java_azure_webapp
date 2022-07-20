package com.webapp.model;


import java.util.List;


import org.springframework.stereotype.Service;


@Service
public interface ICustomer {
    /**
     * @return A list of Customer
     */
    public List<Customer> readCustomers();

    /**
     * @param Customer
     * @return whether the Customer was persisted.
     */
    public Customer createCustomer(Customer cust);

    /**
     * @param id
     * @return the Customer
     */
    public Customer readCustomer(String id);

    /**
     * @param id
     * @return the Customer
     */
    public Customer updateCustomer(String id, boolean isValid);

    /**
     *
     * @param id
     * @return whether the delete was successful.
     */
    public boolean deleteCustomer(String id);
}
