package com.test.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.ecommerce.model.OrderProduct;
import com.test.ecommerce.model.OrderProductPK;
@Repository
public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
