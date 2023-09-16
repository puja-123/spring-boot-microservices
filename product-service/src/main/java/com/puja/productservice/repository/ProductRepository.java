package com.puja.productservice.repository;

import com.puja.productservice.model.Product;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
