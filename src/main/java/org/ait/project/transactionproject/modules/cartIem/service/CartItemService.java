package org.ait.project.transactionproject.modules.cartIem.service;

import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;

import java.util.List;

public interface CartItemService {
    CartItem saveCartItem(CartItem cartItem);

    List<CartItem> saveCartItems(List<CartItem> cartItems);

    List<CartItem> getCartItems();

    CartItem getCartItemById(int id);

    String deleteCartItem(int id);

    CartItem updateCartItem(CartItem cartItem);
}
