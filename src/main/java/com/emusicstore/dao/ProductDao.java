package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by zhaobin on 3/27/2016.
 */
public interface ProductDao {

    void addProduct(Product product);
    void editProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProducts();
    void deleteProduct(String id);

}
