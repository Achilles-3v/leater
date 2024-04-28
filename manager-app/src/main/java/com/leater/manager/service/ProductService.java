package com.leater.manager.service;

import com.leater.manager.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> fineAllProducts();

    Product createProduct(String title, String details);
}
