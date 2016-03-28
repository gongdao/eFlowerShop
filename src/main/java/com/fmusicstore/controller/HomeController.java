package com.fmusicstore.controller;

import com.fmusicstore.dao.ProductDao;
import com.fmusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhaobin on 3/26/2016.
 */

@Controller
public class HomeController {

    @Autowired
    public ProductDao productDao;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("productList")
    public String getProducts(Model model){
        /*List<Product> productList = productDao.getProductList();
        Product product = productList.get(0);
        model.addAttribute(product);*/
        List<Product> products = productDao.getAllProducts();
        model.addAttribute("products",products);

        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException{

        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }
}
