package org.ait.project.transactionproject.modules.cartIem.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CartRequest {
    @NotNull(message = "{customer_id.required}")
    @JsonProperty("customer_id")
    private Integer customerId;

    @NotNull
    @JsonProperty("quantity")
    private Integer quantity;

    @NotNull(message = "{product_id.required}")
    @JsonProperty("product_id")
    private Integer productId;
}
