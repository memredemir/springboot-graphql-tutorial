package com.graphqltutorial.example.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqltutorial.example.entity.Product;
import com.graphqltutorial.example.entity.Seller;
import com.graphqltutorial.example.service.ProductService;
import com.graphqltutorial.example.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ProductMutation implements GraphQLMutationResolver {
    private final ProductService productService;
    private final SellerService sellerService;

    public Product newProduct(Product product) {
        Seller seller = sellerService.findAll().get(0);
        product.setSeller(seller);
        return productService.create(product);
    }

    public Product updateProduct(Product product) {
        return productService.update(product);
    }

    public Product removeProduct(UUID id) {
        return productService.remove(id);
    }
}
