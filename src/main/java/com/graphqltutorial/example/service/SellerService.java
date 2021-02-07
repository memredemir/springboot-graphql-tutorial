package com.graphqltutorial.example.service;

import com.graphqltutorial.example.entity.Seller;

import java.util.List;

public interface SellerService {
    Seller createSeller(Seller seller);
    List<Seller> findAll();
}
