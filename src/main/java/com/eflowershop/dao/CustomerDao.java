package com.eflowershop.dao;

import com.eflowershop.model.Customer;

import java.util.List;

/**
 * Created by zhaobin on 4/3/2016.
 */
public interface CustomerDao {
    void addCustomer (Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);
}
