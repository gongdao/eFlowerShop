package com.eflowershop.dao;

import com.eflowershop.model.Product;

import java.util.List;

/**
 * Created by zhaobin on 3/27/2016.
 */
public interface ProductDao {

    List<Product> getProductList();
    Product getProductById(int id);
    void addProduct(Product product);
    void editProduct(Product product);
    void deleteProduct(Product product);
}
