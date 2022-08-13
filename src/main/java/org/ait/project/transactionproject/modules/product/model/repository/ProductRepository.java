package org.ait.project.transactionproject.modules.product.model.repository;

import org.ait.project.transactionproject.modules.product.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
