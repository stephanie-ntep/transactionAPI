package org.ait.project.transactionproject.modules.customer.model.repository;

import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
