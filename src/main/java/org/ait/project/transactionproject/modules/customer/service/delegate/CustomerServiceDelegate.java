package org.ait.project.transactionproject.modules.customer.service.delegate;

import org.ait.project.transactionproject.modules.customer.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceDelegate {
    List<Customer> getCustomers();
}
