package org.ait.project.transactionproject.modules.product.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.product.dto.request.ProductRequest;
import org.ait.project.transactionproject.modules.product.dto.response.ProductResponse;
import org.ait.project.transactionproject.modules.product.model.entity.Product;
import org.ait.project.transactionproject.modules.product.service.delegate.ProductServiceDelegate;
import org.ait.project.transactionproject.modules.product.service.internal.ProductService;
import org.ait.project.transactionproject.modules.product.transform.ProductMapper;
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
public class ProductServiceImpl implements ProductService {
    private final ResponseHelper responseHelper;

    private final ProductServiceDelegate productDelegate;

    private final ProductMapper productTransform;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> getAllProducts() {
        List<Product> productList = productDelegate.getProducts();

        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null,
                productTransform.toProductsDto(productList));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> getProductById(Integer id) {
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                productTransform.toProductDto(productDelegate.getProductById(id)));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> addProduct(ProductRequest productRequest) {
        Product product = productDelegate.saveProduct(productTransform.toProductRequest(productRequest));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                productTransform.toProductDto(product));
    }

}
