package com.example.springbootdocker.service;

import com.example.springbootdocker.model.Product;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 09:48 on Sep, 2021
 */
public interface ProductService {
    List<Product> getProducts();
    Product getProductById(Integer id);
}
