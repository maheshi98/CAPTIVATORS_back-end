package com.springboot.Mango.Restaurant.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.Mango.Restaurant.Model.Order;

public interface OrderRepository extends MongoRepository<Order,String> {

}
