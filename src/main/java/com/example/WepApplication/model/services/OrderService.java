package com.example.WepApplication.model.services;

import com.example.WepApplication.model.entities.Order;
import com.example.WepApplication.model.entities.User;
import com.example.WepApplication.model.repositories.OrderRepository;
import com.example.WepApplication.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll(){
        return OrderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> optionalOrder =  OrderRepository.findById(id);
        return optionalOrder.get();
    }

}
