package com.example.springbootdocker.controller;

import com.example.springbootdocker.model.Product;
import com.example.springbootdocker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String getProductPage(Model model){
        List<Product> productList =  productService.getProducts();
        model.addAttribute("productList", productList);
        return "product";
    }

    @GetMapping("/add")
    public String getProductAddPage(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "add";
    }

//    @PostMapping("/add")
//    @ResponseBody
//    public String addProduct(@ModelAttribute Product product){
//        return "success";
//    }


}
