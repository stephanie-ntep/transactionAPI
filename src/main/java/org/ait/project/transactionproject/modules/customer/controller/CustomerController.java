package org.ait.project.transactionproject.modules.customer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.service.internal.CustomerService;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.transform.CustomerMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor

@RestController
@RequestMapping("/api")
public class CustomerController{
    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<CustomerDTO> customerList = customerMapper.toCustomersDto(customerService.getAllCustomers());
        return ResponseEntity.ok(customerList);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerDTO> findById(@PathVariable int id) {
        Optional<Customer> customer = customerService.findById(id);
        CustomerDTO customerDTO = customerMapper.toCustomerDto(customer.get());
        return ResponseEntity.ok(customerDTO);
    }

}
