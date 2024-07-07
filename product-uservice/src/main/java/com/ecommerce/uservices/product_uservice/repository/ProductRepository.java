package com.ecommerce.uservices.product_uservice.repository;

import com.ecommerce.uservices.product_uservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
