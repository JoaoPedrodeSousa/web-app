package com.example.WepApplication.model.services;

import com.example.WepApplication.model.entities.Category;
import com.example.WepApplication.model.entities.Order;
import com.example.WepApplication.model.repositories.CategoryRepository;
import com.example.WepApplication.model.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> optionalCategory =  categoryRepository.findById(id);
        return optionalCategory.get();
    }

}
