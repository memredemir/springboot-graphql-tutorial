package com.graphqltutorial.example.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqltutorial.example.entity.Seller;
import com.graphqltutorial.example.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SellerMutation implements GraphQLMutationResolver {
    private final SellerService sellerService;

    public Seller newSeller(Seller seller) {
        return sellerService.createSeller(seller);
    }
}
