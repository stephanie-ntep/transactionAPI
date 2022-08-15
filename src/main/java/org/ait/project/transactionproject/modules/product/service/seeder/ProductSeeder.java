package org.ait.project.transactionproject.modules.product.service.seeder;

import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.model.repository.CustomerRepository;
import org.ait.project.transactionproject.modules.product.model.entity.Product;
import org.ait.project.transactionproject.modules.product.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductSeeder implements CommandLineRunner {
    @Autowired
    ProductRepository productRepository;

    @Override
    //Seeding Customer data...
    public void run(String... args) throws Exception {
        loadCustomerData();
    }

    private void loadCustomerData() {
        if (productRepository.count() == 0) {
            Product product1 = new Product("Xiaomi", 5, "3000000");
            Product product2 = new Product("Samsung", 5, "5000000");
            Product product3 = new Product("Oppo", 5, "2500000");
            Product product4 = new Product("Vivo", 0, "3500000");
            Product product5 = new Product("Iphone", 2, "7000000");
            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);
            productRepository.save(product4);
            productRepository.save(product5);
        }
        System.out.println(productRepository.count());
    }
}
