package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gullian Van Der Walt
 * Created at 09:47 on Sep, 2021
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
