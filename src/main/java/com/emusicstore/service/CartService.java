package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by zhaobin on 4/5/2016.
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
