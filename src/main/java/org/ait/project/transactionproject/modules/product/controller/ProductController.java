package org.ait.project.transactionproject.modules.product.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.product.model.entity.Product;
import org.ait.project.transactionproject.modules.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductService {
    private final ProductService productService;

    @PutMapping("/updateproduct/{id}")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @PostMapping("/addproduct")
    public Product saveProduct(@RequestBody Product product) { return productService.saveProduct(product);}

    @PostMapping("/addproducts")
    public List<Product> saveProducts(List<Product> products) {return productService.saveProducts(products);}

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}
