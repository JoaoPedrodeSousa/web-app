package com.example.WepApplication.model.repositories;

import com.example.WepApplication.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
