package org.ait.project.transactionproject.modules.customer.transform;

import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDto(Customer customer);

    List<CustomerDTO> toCustomersDto(List<Customer> customers);

    Customer toCustomer(CustomerDTO customerDTO);
}
