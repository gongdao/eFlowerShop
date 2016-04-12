package com.eflowershop.service;

import com.eflowershop.model.CustomerOrder;

/**
 * Created by zhaobin on 4/6/2016.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
