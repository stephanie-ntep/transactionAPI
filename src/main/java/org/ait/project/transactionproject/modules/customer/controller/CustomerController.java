package org.ait.project.transactionproject.modules.customer.controller;

import lombok.AllArgsConstructor;
import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.service.internal.CustomerService;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CustomerController implements CustomerService{
    private final CustomerService customerService;

    @Override
    @GetMapping("/customers")
    public ResponseEntity<ResponseTemplate<ResponseList<CustomerDTO>>> getAllJsonPlaceHolderCustomer() {
        return customerService.getAllJsonPlaceHolderCustomer();
    }
}
