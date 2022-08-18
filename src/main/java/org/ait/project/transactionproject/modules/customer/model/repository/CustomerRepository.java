package org.ait.project.transactionproject.modules.customer.model.repository;

import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
