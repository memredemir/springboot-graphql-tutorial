package com.graphqltutorial.example.service;

import com.graphqltutorial.example.entity.Product;
import com.graphqltutorial.example.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public Product getById(UUID id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product remove(UUID id) {
        Optional<Product> removedProduct = productRepository.findById(id);
        if(removedProduct.isPresent()) {
            productRepository.deleteById(id);
        }
        return removedProduct.orElse(null);
    }
}
