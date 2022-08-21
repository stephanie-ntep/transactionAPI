package org.ait.project.transactionproject.modules.cartIem.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;
import org.ait.project.transactionproject.modules.cartIem.model.entity.view.ViewCartItem;
import org.ait.project.transactionproject.modules.cartIem.model.repository.CartItemRepository;
import org.ait.project.transactionproject.modules.cartIem.model.repository.view.ViewCartItemRepository;
import org.ait.project.transactionproject.modules.cartIem.service.delegate.CartItemServiceDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartItemServiceDelegateImpl implements CartItemServiceDelegate {
    private final CartItemRepository cartItemRepository;

    private final ViewCartItemRepository viewCartItemRepository;

    @Override
    public CartItem saveCartItem(CartItem cartItem){
        return cartItemRepository.save(cartItem);
    }

    @Override
    public List<CartItem> saveCartItems(List<CartItem> cartItems){
        return cartItemRepository.saveAll(cartItems);
    }

    @Override
    public List<ViewCartItem> getCartItems(){
        return viewCartItemRepository.findAll();
    }

    @Override
    public ViewCartItem getCartItemById(Integer id) {
        return viewCartItemRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteCartItem(Integer id){
        cartItemRepository.deleteById(id);
        return "Successful to delete cartItem with Id = "+id;
    }

//    @Override
//    public CartItem updateCartItem(CartItem cartItem){
//        CartItem existingCartItem=cartItemRepository.findById(cartItem.getId()).orElse(null);
//        existingCartItem.setProduct(cartItem.getProduct());
//        existingCartItem.setCustomer(cartItem.getCustomer());
//        existingCartItem.setQuantity(cartItem.getQuantity());
//        return cartItemRepository.save(existingCartItem);
//    }
}
