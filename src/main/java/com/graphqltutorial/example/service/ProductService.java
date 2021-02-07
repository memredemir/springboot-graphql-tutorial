package com.graphqltutorial.example.service;

import com.graphqltutorial.example.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    Product getById(UUID id);
    List<Product> getAll();
    Product create(Product product);
    Product update(Product product);
    Product remove(UUID id);
}
