package org.ait.project.transactionproject.modules.product.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ProductRequest {
    @NotBlank(message = "{name.required}")
    @JsonProperty("name")
    private String name;

    @NotBlank(message = "{quantity.required}")
    @JsonProperty("quantity")
    private String quantity;

    @NotBlank(message = "{price.required}")
    @JsonProperty("price")
    private String price;
}
