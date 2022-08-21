package org.ait.project.transactionproject.modules.cartIem.service.internal;

import org.ait.project.transactionproject.modules.cartIem.dto.request.CartRequest;
import org.ait.project.transactionproject.modules.cartIem.dto.response.CartResponse;
import org.ait.project.transactionproject.modules.product.dto.request.ProductRequest;
import org.ait.project.transactionproject.modules.product.dto.response.ProductResponse;
import org.ait.project.transactionproject.shared.dto.template.ResponseDetail;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface CartItemService {
    ResponseEntity<ResponseTemplate<ResponseList<CartResponse>>> getAllCarts();

    ResponseEntity<ResponseTemplate<ResponseDetail<CartResponse>>> getCartById(Integer id);

    ResponseEntity<ResponseTemplate<ResponseDetail<CartResponse>>> addCart(CartRequest cartRequest);
}
