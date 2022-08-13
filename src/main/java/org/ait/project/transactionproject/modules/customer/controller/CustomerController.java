package org.ait.project.transactionproject.modules.customer.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.customer.service.CustomerService;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController implements CustomerService {
    private final CustomerService customerService;

    @PutMapping("/updatecustomer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @PostMapping("/addcustomer")
    public Customer saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PostMapping("/addcustomers")
    public List<Customer> saveCustomers(List<Customer> customers) {
        return customerService.saveCustomers(customers);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable int id){
        return customerService.deleteCustomer(id);
    }
}
