package com.test.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.ecommerce.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
