package org.ait.project.transactionproject.modules.customer.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.model.repository.CustomerRepository;
import org.ait.project.transactionproject.modules.customer.service.internal.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int id){
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteCustomer(int id){
        customerRepository.deleteById(id);
        return "Successful to delete customer with Id = "+id;
    }

}
