package org.ait.project.transactionproject.modules.cartIem.model.repository.view;

import org.ait.project.transactionproject.modules.cartIem.model.entity.view.ViewCartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewCartItemRepository extends JpaRepository<ViewCartItem, Integer> {
}
