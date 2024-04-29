package com.leater.catalogue.repository;

import com.leater.catalogue.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> fineAll();

    Product save(Product product);

    Optional<Product> fineById(Integer productId);

    void deleteById(Integer id);
}
