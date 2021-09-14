package com.example.springbootdocker.controller;

import com.example.springbootdocker.model.Product;
import com.example.springbootdocker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 09:51 on Sep, 2021
 */
@Controller
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public String getProductPage(){
        return "products";
    }

    @PostMapping("/get-products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
