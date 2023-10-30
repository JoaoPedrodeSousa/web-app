package com.WebApplication.model.services;

import com.WebApplication.model.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private com.WebApplication.model.repositories.OrderRepository OrderRepository;

    public List<Order> findAll(){
        return OrderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> optionalOrder =  OrderRepository.findById(id);
        return optionalOrder.get();
    }

}
