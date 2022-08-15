package org.ait.project.transactionproject.modules.cartIem.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;
import org.ait.project.transactionproject.modules.cartIem.service.CartItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartItemController implements CartItemService{
    private final CartItemService cartItemService;

    @PutMapping("/updatecartItem")
    public CartItem updateCartItem(@RequestBody CartItem cartItem){
        return cartItemService.updateCartItem(cartItem);
    }

    @PostMapping("/addcartItem")
    public CartItem saveCartItem(CartItem cartItem) {
        return cartItemService.saveCartItem(cartItem);
    }

    @PostMapping("/addcartItems")
    public List<CartItem> saveCartItems(List<CartItem> cartItems) {
        return cartItemService.saveCartItems(cartItems);
    }

    @GetMapping("/cartItems")
    public List<CartItem> getCartItems() {
        return cartItemService.getCartItems();
    }

    @GetMapping("/cartItem/{id}")
    public CartItem getCartItemById(@PathVariable int id) {
        return cartItemService.getCartItemById(id);
    }

    @DeleteMapping("/deletecartItem/{id}")
    public String deleteCartItem(@PathVariable int id){
        return cartItemService.deleteCartItem(id);
    }
}
