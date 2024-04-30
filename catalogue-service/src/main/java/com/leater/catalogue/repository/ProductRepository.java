package com.leater.catalogue.repository;

import com.leater.catalogue.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
