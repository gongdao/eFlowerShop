package com.eflowershop.dao;

import com.eflowershop.model.Cart;
import com.eflowershop.model.CartItem;

/**
 * Created by zhaobin on 4/6/2016.
 */
public interface CartItemDao {
    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
