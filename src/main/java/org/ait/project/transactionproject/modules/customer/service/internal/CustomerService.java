package org.ait.project.transactionproject.modules.customer.service.internal;

import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;

import java.util.List;

public interface CustomerService {
//    List<Customer> getCustomers();
//
//    Customer getCustomerById(int id);
//
//    String deleteCustomer(int id);

    List<CustomerDTO> getAllCustomers();

}
