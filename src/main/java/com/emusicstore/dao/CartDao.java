package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by zhaobin on 3/30/2016.
 */
public interface CartDao {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update (String cardId, Cart cart);

    void delete (String cartId);
}
