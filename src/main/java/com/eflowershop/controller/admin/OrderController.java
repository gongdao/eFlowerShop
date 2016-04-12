package com.eflowershop.controller.admin;

import com.eflowershop.model.Cart;
import com.eflowershop.model.Customer;
import com.eflowershop.model.CustomerOrder;
import com.eflowershop.service.CartService;
import com.eflowershop.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhaobin on 4/6/2016.
 */
@Controller
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private CustomerOrderService customerOrderService;

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable(value = "cartId")int cartId){

        CustomerOrder customerOrder = new CustomerOrder();
        Cart cart= cartService.getCartById(cartId);
        customerOrder.setCart(cart);

        Customer customer = cart.getCustomer();
        customerOrder.setCustomer(customer);
        //System.out.println("customerId = "+ customer.getCustomerId());
        customerOrder.setBillingAddress(customer.getBillingAddress());
        customerOrder.setShipingAddress(customer.getShippingAddress());

        customerOrderService.addCustomerOrder(customerOrder);

        return "redirect:/checkout?cartId="+cartId;
    }
}
