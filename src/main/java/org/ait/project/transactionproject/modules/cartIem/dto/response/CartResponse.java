package org.ait.project.transactionproject.modules.cartIem.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ait.project.transactionproject.modules.customer.dto.response.CustomerDTO;
import org.ait.project.transactionproject.modules.product.dto.response.ProductResponse;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponse {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("customer")
    private CustomerDTO customer;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("product")
    private ProductResponse product;
}
