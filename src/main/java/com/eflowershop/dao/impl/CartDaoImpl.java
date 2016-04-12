package com.eflowershop.dao.impl;

import com.eflowershop.dao.CartDao;
import com.eflowershop.model.Cart;
import com.eflowershop.service.CustomerOrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by zhaobin on 4/5/2016.
 */
@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private CustomerOrderService customerOrderService;

    public Cart getCartById (int cartId){
        Session session = sessionFactory.getCurrentSession();
        return (Cart) session.get(Cart.class,cartId);
    }

    public void update(Cart cart){
        int cartId = cart.getCartId();
        double grandtotal= customerOrderService.getCustomerOrderGrandTotal(cartId);
        cart.setGrandTotal(grandtotal);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);
    }

    public Cart validate(int cartId) throws IOException{
        System.out.println("validating!!!!!");
        Cart cart=getCartById(cartId);
        if(cart==null||cart.getCartItems().size()==0){
            System.out.println("exception!!!!");
            throw new IOException(cartId+"");
        }

        update(cart);
        System.out.println("validated___________");
        return cart;
    }

}
