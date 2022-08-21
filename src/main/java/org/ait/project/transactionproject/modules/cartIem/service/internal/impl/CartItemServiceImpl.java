package org.ait.project.transactionproject.modules.cartIem.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.transactionproject.modules.cartIem.dto.request.CartRequest;
import org.ait.project.transactionproject.modules.cartIem.dto.response.CartResponse;
import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;
import org.ait.project.transactionproject.modules.cartIem.model.entity.view.ViewCartItem;
import org.ait.project.transactionproject.modules.cartIem.service.delegate.CartItemServiceDelegate;
import org.ait.project.transactionproject.modules.cartIem.service.internal.CartItemService;
import org.ait.project.transactionproject.modules.cartIem.transform.CartItemMapper;
import org.ait.project.transactionproject.shared.constant.enums.ResponseEnum;
import org.ait.project.transactionproject.shared.dto.template.ResponseDetail;
import org.ait.project.transactionproject.shared.dto.template.ResponseList;
import org.ait.project.transactionproject.shared.dto.template.ResponseTemplate;
import org.ait.project.transactionproject.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService {
    private final ResponseHelper responseHelper;

    private final CartItemServiceDelegate cartDelegate;

    private final CartItemMapper cartTransform;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<CartResponse>>> getAllCarts() {
        List<ViewCartItem> viewCartItemList = cartDelegate.getCartItems();

        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null,
                cartTransform.toCartsDto(viewCartItemList));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<CartResponse>>> getCartById(Integer id) {
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                cartTransform.toCartDto(cartDelegate.getCartItemById(id)));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<CartResponse>>> addCart(CartRequest cartRequest) {
        CartItem cartItem = cartDelegate.saveCartItem(cartTransform.toCartRequest(cartRequest));

        ViewCartItem viewCartItem = cartDelegate.getCartItemById(cartItem.getId());

        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                cartTransform.toCartDto(viewCartItem));
    }
}
