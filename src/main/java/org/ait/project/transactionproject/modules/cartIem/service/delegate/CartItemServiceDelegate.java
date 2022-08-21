package org.ait.project.transactionproject.modules.cartIem.service.delegate;

import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;
import org.ait.project.transactionproject.modules.cartIem.model.entity.view.ViewCartItem;

import java.util.List;

public interface CartItemServiceDelegate {
    CartItem saveCartItem(CartItem cartItem);

    List<CartItem> saveCartItems(List<CartItem> cartItems);

    List<ViewCartItem> getCartItems();

    ViewCartItem getCartItemById(Integer id);

    String deleteCartItem(Integer id);

//    CartItem updateCartItem(CartItem cartItem);
}
