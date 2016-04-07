package com.emusicstore.dao.impl;

import com.emusicstore.dao.CustomerOrderDao;
import com.emusicstore.model.CustomerOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhaobin on 4/6/2016.
 */

public class CustomerOrderDaoImpl implements CustomerOrderDao {

    @Autowired
    private SessionFactory sessionFactory;


    public void addCustomerOrder(CustomerOrder customerOrder){

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customerOrder);
        session.flush();
    }

}
