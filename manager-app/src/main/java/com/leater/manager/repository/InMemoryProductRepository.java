package com.leater.manager.repository;

import com.leater.manager.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> products = Collections.synchronizedList(new LinkedList<>());

    @Override
    public List<Product> fineAll() {
        return Collections.unmodifiableList(this.products);
    }
}
