package com.example.WepApplication.model.repositories;

import com.example.WepApplication.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> { }
