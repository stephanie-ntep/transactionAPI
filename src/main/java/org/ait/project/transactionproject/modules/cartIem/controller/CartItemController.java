package org.ait.project.transactionproject.modules.cartIem.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.cartIem.dto.request.CartRequest;
import org.ait.project.transactionproject.modules.cartIem.dto.response.CartResponse;
import org.ait.project.transactionproject.modules.cartIem.service.internal.CartItemService;
import org.ait.project.transactionproject.shared.dto.template.ResponseDetail;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CartItemController implements CartItemService {

    private final CartItemService cartService;

    @Override
    @GetMapping("/carts")
    public ResponseEntity<ResponseTemplate<ResponseList<CartResponse>>> getAllCarts() {
        return cartService.getAllCarts();
    }

    @Override
    @GetMapping("cart/{id}")
    public ResponseEntity<ResponseTemplate<ResponseDetail<CartResponse>>> getCartById(@PathVariable Integer id) {
        return cartService.getCartById(id);
    }

    @Override
    @PostMapping("/addCart")
    public ResponseEntity<ResponseTemplate<ResponseDetail<CartResponse>>> addCart(@Valid @RequestBody CartRequest cartRequest) {
        return cartService.addCart(cartRequest);
    }
}
