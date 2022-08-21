package org.ait.project.transactionproject.modules.cartIem.transform;


import org.ait.project.transactionproject.modules.cartIem.dto.request.CartRequest;
import org.ait.project.transactionproject.modules.cartIem.dto.response.CartResponse;
import org.ait.project.transactionproject.modules.cartIem.model.entity.CartItem;
import org.ait.project.transactionproject.modules.cartIem.model.entity.view.ViewCartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartItemMapper {
    CartResponse toCartDto(ViewCartItem cart);

    List<CartResponse> toCartsDto(List<ViewCartItem> carts);

    CartItem toCartEntity(CartResponse cartDto);

    CartItem toCartRequest(CartRequest cartRequest);
}
