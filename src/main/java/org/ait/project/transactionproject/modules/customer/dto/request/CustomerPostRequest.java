package org.ait.project.transactionproject.modules.customer.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Data
public class CustomerPostRequest {
    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @Email(message = "{email.required}")
    @JsonProperty("email")
    private String email;

    @NotNull
    @JsonProperty("address")
    private String address;

    @NotNull
    @JsonProperty("phoneNumber")
    private String phoneNumber;
}
