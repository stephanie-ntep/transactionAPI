package org.ait.project.transactionproject.modules.product.service.delegate;

import org.ait.project.transactionproject.modules.product.model.entity.Product;

import java.util.List;

public interface ProductServiceDelegate {
    Product saveProduct(Product product);

    List<Product> saveProducts(List<Product> products);

    List<Product> getProducts();

    Product getProductById(Integer id);

    String deleteProduct(Integer id);

    Product updateProduct(Product product);
}
