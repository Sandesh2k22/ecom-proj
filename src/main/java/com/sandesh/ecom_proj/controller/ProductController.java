package com.sandesh.ecom_proj.controller;

import com.sandesh.ecom_proj.model.Product;
import com.sandesh.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "Hello Spring!";
    }

    @GetMapping("/product")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
