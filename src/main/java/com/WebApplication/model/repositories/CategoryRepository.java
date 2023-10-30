package com.WebApplication.model.repositories;

import com.WebApplication.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> { }
