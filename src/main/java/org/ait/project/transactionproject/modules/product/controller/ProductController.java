package org.ait.project.transactionproject.modules.product.controller;

import lombok.AllArgsConstructor;
import org.ait.project.transactionproject.modules.product.dto.request.ProductRequest;
import org.ait.project.transactionproject.modules.product.dto.response.ProductResponse;
import org.ait.project.transactionproject.modules.product.service.internal.ProductService;
import org.ait.project.transactionproject.shared.dto.template.ResponseDetail;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class ProductController implements ProductService {
    private final ProductService productService;

    @Override
    @GetMapping("/products")
    public ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> getAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    @GetMapping("/product/{id}")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @Override
    @PostMapping("/addproduct")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> addProduct(@Valid @RequestBody ProductRequest productRequest) {
        return productService.addProduct(productRequest);
    }
}
