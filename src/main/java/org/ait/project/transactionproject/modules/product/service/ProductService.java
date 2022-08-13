package org.ait.project.transactionproject.modules.product.service;

import org.ait.project.transactionproject.modules.product.model.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> saveProducts(List<Product> products);

    List<Product> getProducts();

    Product getProductById(int id);

    String deleteProduct(int id);

    Product updateProduct(Product product);
}
