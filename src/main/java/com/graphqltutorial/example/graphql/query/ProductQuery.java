package com.graphqltutorial.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqltutorial.example.entity.Product;
import com.graphqltutorial.example.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ProductQuery implements GraphQLQueryResolver {
    private final ProductService productService;

    public List<Product> products() {
        return productService.getAll();
    }

    public Product product(UUID id) {
        return productService.getById(id);
    }
}