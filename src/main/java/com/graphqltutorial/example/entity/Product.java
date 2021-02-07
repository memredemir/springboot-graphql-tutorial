package com.graphqltutorial.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    private String title;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
}
