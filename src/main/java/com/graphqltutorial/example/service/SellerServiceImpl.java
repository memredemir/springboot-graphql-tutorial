package com.graphqltutorial.example.service;

import com.graphqltutorial.example.entity.Seller;
import com.graphqltutorial.example.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SellerServiceImpl implements SellerService{
    private final SellerRepository sellerRepository;

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }
}
