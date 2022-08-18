package org.ait.project.transactionproject.modules.customer.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.model.repository.CustomerRepository;
import org.ait.project.transactionproject.modules.customer.service.delegate.CustomerServiceDelegate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceDelegateImpl implements CustomerServiceDelegate {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getByCustomerId(Integer id) {
        return customerRepository.findById(id);
    }
}
