package org.ait.project.transactionproject.modules.customer.service;

import org.ait.project.transactionproject.modules.customer.model.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer Customer);

    List<Customer> saveCustomers(List<Customer> Customers);

    List<Customer> getCustomers();

    Customer getCustomerById(int id);

    String deleteCustomer(int id);

    Customer updateCustomer(Customer Customer);
}
