package com.example.WepApplication.model.repositories;

import com.example.WepApplication.model.entities.Category;
import com.example.WepApplication.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> { }
