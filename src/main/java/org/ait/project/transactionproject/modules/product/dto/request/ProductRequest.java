package org.ait.project.transactionproject.modules.product.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProductRequest {
    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("quantity")
    private Integer quantity;

    @NotNull
    @JsonProperty("price")
    private String price;
}
