package com.eflowershop.service;

import com.eflowershop.model.Cart;
import com.eflowershop.model.CartItem;

/**
 * Created by zhaobin on 4/5/2016.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
