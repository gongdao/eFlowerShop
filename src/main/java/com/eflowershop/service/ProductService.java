package com.eflowershop.service;

import com.eflowershop.model.Product;

import java.util.List;

/**
 * Created by zhaobin on 4/1/2016.
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
