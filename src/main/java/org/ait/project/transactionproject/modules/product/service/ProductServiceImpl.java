package org.ait.project.transactionproject.modules.product.service;


import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.product.model.entity.Product;
import org.ait.project.transactionproject.modules.product.model.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    @Override
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    @Override
    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Successful to delete product with Id = "+id;
    }

    @Override
    public Product updateProduct(Product product){
        Product existingProduct=productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }
}
