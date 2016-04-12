package com.emusicstore.dao;

import com.emusicstore.model.Cart;

import java.io.IOException;

/**
 * Created by zhaobin on 3/30/2016.
 */
public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
