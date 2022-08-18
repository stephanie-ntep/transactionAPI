package org.ait.project.transactionproject.modules.customer.service.delegate.impl;

import lombok.AllArgsConstructor;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.model.repository.CustomerRepository;
import org.ait.project.transactionproject.modules.customer.service.delegate.CustomerServiceDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceDelegateImpl implements CustomerServiceDelegate {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

}
