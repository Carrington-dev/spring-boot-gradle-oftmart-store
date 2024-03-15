package com.oftmartstore.oftmartstore.services;

import com.oftmartstore.oftmartstore.models.Product;
import com.oftmartstore.oftmartstore.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    private final List<Product> productList = new ArrayList<>(
            Arrays.asList(
                new Product(1, "New Iphone For Sale", 23.56),
                new Product(2, "New Iphone For Sale", 23.56),
                new Product(3, "New Iphone For Sale", 23.56),
                new Product(4, "New Iphone For Sale", 23.56),
                new Product(5, "New Iphone For Sale", 23.56),
                new Product(6, "New Iphone For Sale", 23.56)
            )
    );


    private final List<Product> cartItems = new ArrayList<>(
            List.of(
                    new Product(1, "New Iphone For Sale", 23.56)
            )
    );

    public List<Product> getProductList() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
//        return productList;
        return products;
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }
}
