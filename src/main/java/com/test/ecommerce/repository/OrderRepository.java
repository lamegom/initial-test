package com.test.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.ecommerce.model.Order;
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
