package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by zhaobin on 3/30/2016.
 */
public interface CartDao {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
