package com.fmusicstore.dao;

import com.fmusicstore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaobin on 3/27/2016.
 */
public class ProductDao {
    private List<Product> productList;

    public List<Product> getProductList() {

        Product product1 = new Product();
        product1.setProductId("first");
        product1.setProductName("Gitar1");
        product1.setProductCategory("instrument");
        product1.setProductDescription("It is a good.");
        product1.setProductPrice(1200);
        product1.setProductCondition("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");

        Product product2 = new Product();
        product2.setProductId("second");
        product2.setProductName("Gitar2");
        product2.setProductCategory("instrument");
        product2.setProductDescription("It is a very good.");
        product2.setProductPrice(1200);
        product2.setProductCondition("Active");
        product2.setUnitInStock(11);
        product2.setProductManufacturer("York");

        Product product3 = new Product();
        product3.setProductId("third");
        product3.setProductName("Gitar3");
        product3.setProductCategory("instrument");
        product3.setProductDescription("It is a awesome.");
        product3.setProductPrice(1200);
        product3.setProductCondition("Active");
        product3.setUnitInStock(11);
        product3.setProductManufacturer("church");

        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getProductById(String productId) throws IOException{
        for (Product product:getProductList()) {
            if(product.getProductId().equals(productId)){
                return product;
            }
        }
    throw new IOException("No product dound.");
    }

}
