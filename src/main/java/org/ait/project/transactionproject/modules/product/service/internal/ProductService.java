package org.ait.project.transactionproject.modules.product.service.internal;

import org.ait.project.transactionproject.modules.product.dto.request.ProductRequest;
import org.ait.project.transactionproject.modules.product.dto.response.ProductResponse;
import org.ait.project.transactionproject.shared.dto.template.ResponseDetail;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface ProductService {
    ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> getAllProducts();

    ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> getProductById(Integer id);

    ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> addProduct(ProductRequest productRequest);
}
