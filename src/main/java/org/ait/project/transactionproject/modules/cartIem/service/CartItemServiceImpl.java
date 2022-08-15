package org.ait.project.transactionproject.modules.cartIem.service;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;
import org.ait.project.transactionproject.modules.cartIem.model.repository.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService{
    private final CartItemRepository cartItemRepository;

    @Override
    public CartItem saveCartItem(CartItem cartItem){
        return cartItemRepository.save(cartItem);
    }

    @Override
    public List<CartItem> saveCartItems(List<CartItem> cartItems){
        return cartItemRepository.saveAll(cartItems);
    }

    @Override
    public List<CartItem> getCartItems(){
        return cartItemRepository.findAll();
    }

    @Override
    public CartItem getCartItemById(int id){
        return cartItemRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteCartItem(int id){
        cartItemRepository.deleteById(id);
        return "Successful to delete cartItem with Id = "+id;
    }

    @Override
    public CartItem updateCartItem(CartItem cartItem){
        CartItem existingCartItem=cartItemRepository.findById(cartItem.getId()).orElse(null);
        existingCartItem.setProduct(cartItem.getProduct());
        existingCartItem.setCustomer(cartItem.getCustomer());
        existingCartItem.setQuantity(cartItem.getQuantity());
        return cartItemRepository.save(existingCartItem);
    }
}
