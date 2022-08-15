package org.ait.project.transactionproject.modules.customer.service;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.model.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> saveCustomers(List<Customer> customers){
        return customerRepository.saveAll(customers);
    }

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

    @Override
    public Customer updateCustomer(Customer customer){
        Customer existingCustomer=customerRepository.findById(customer.getId()).orElse(null);
        existingCustomer.setName(customer.getName());
        existingCustomer.setPhoneNumber(customer.getPhoneNumber());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setAddress(customer.getAddress());
        return customerRepository.save(existingCustomer);
    }
}
