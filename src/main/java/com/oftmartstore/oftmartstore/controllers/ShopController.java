package com.oftmartstore.oftmartstore.controllers;

import com.oftmartstore.oftmartstore.models.Product;
import com.oftmartstore.oftmartstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {
    @Autowired
    private ProductService productService = new ProductService();
    
    @GetMapping("/")
    public String getHome(){
        return "<h1>Welcome to Oftmart API Development</h1>";
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProductList();
    }

@PostMapping("/products")
    public void addProduct(@RequestBody Product body){
        productService.addProduct(body);
    }


    @GetMapping("/cart")
    public List<Product> getCart(){
        return productService.getCartItems();
    }
}
