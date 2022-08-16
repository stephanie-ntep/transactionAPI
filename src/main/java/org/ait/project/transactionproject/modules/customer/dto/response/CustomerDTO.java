package org.ait.project.transactionproject.modules.customer.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CustomerDTO {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
}
