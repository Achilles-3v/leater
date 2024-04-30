package com.leater.catalogue.service;

import com.leater.catalogue.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Iterable<Product> fineAllProducts();

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(Integer id, String title, String details);

    void deleteProduct(Integer id);
}
