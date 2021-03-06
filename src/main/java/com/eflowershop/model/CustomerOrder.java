package com.eflowershop.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zhaobin on 4/1/2016.
 */

@Entity
public class CustomerOrder implements Serializable{
    private static final long serialVersionUID = 2983360377227484514L;

    @Id
    @GeneratedValue
    private int customerOrderId;

    @OneToOne
    @JoinColumn(name="cartId")
    private Cart cart;

    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customer;

    @OneToOne
    @JoinColumn(name="billingAddressId")
    private BillingAddress billingAddress;

    @OneToOne
    @JoinColumn(name="shippingAddressId")
    private ShippingAddress shipingAddress;

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public ShippingAddress getShipingAddress() {
        return shipingAddress;
    }

    public void setShipingAddress(ShippingAddress shipingAddress) {
        this.shipingAddress = shipingAddress;
    }
}
