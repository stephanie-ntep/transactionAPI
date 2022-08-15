package org.ait.project.transactionproject.modules.cartIem.model.repository;

import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
}
