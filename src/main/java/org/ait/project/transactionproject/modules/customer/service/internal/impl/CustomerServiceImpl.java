package org.ait.project.transactionproject.modules.customer.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.model.repository.CustomerRepository;
import org.ait.project.transactionproject.modules.customer.service.internal.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

//    @Override
//    public List<Customer> getCustomers(){
//        return customerRepository.findAll();
//    }
//
//    @Override
//    public Customer getCustomerById(int id){
//        return customerRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public String deleteCustomer(int id){
//        customerRepository.deleteById(id);
//        return "Successful to delete customer with Id = "+id;
//    }

    public List<CustomerDTO> getAllCustomers(){
        return customerRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }


    private CustomerDTO convertEntityToDto(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setPhoneNumber(customer.getPhoneNumber());
        customerDTO.setAddress(customer.getAddress());
        return customerDTO;
    }
}
