package org.ait.project.transactionproject.modules.product.transform;

import org.ait.project.transactionproject.modules.product.dto.request.ProductRequest;
import org.ait.project.transactionproject.modules.product.dto.response.ProductResponse;
import org.ait.project.transactionproject.modules.product.model.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponse toProductDto (Product product);

    List<ProductResponse> toProductsDto(List<Product> products);

    Product toProductRequest(ProductRequest productRequest);
}
