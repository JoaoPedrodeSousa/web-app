package com.WebApplication.model.repositories;

import com.WebApplication.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> { }
