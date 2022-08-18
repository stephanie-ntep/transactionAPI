package org.ait.project.transactionproject.modules.customer.service.internal;

import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.shared.dto.template.ResponseDetail;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Optional<Customer> findById(int id);

}
