package org.ait.project.transactionproject.modules.customer.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.service.delegate.CustomerServiceDelegate;
import org.ait.project.transactionproject.modules.customer.service.internal.CustomerService;
import org.ait.project.transactionproject.modules.customer.transform.CustomerMapper;
import org.ait.project.transactionproject.shared.constant.enums.ResponseEnum;
import org.ait.project.transactionproject.shared.dto.template.ResponseDetail;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.ait.project.transactionproject.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final ResponseHelper responseHelper;

    private final CustomerServiceDelegate customerDelegate;

    private final CustomerMapper customerTransform;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<CustomerDTO>>> getAllJsonPlaceHolderCustomer() {
        List<Customer> customerList = customerDelegate.getCustomers();

        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null,
                customerTransform.toCustomersDto(customerList));
    }

}
