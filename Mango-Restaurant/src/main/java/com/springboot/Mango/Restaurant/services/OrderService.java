package com.springboot.Mango.Restaurant.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.Mango.Restaurant.Model.Order;
import com.springboot.Mango.Restaurant.Repository.OrderRepository;

public class OrderService {
	 @Autowired
	 public  OrderRepository orderRepository ;


	    public Order addDetailsService(Order order){
//	        SequenceGeneratorService sq = new SequenceGeneratorService();
//	        shoppingCart.setCartId(sq.generateSequence(shoppingCart.SEQUANCE_NAME));

	        return orderRepository.save(order);
	    }
	    public ArrayList<Order> getOrderDetails(){
	        return (ArrayList<Order>) orderRepository.findAll();
	    }

	    public void clearCart(){
	    	orderRepository.deleteAll();
	    }
	    public void deleteOrder(String id){
	    	orderRepository.deleteById(id);
	    }

}
