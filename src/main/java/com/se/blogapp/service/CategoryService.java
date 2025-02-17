package com.se.blogapp.service;

import com.se.blogapp.dto.CategoryDto;
import com.se.blogapp.dto.CreatCategoryRequest;
import com.se.blogapp.model.Category;
import com.se.blogapp.repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category>getAllCategories() {
        return categoryRepository.findAllWithPostCount();
    }
    public Category createCategory(CreatCategoryRequest request) {
        Optional<Category> optionalCategory = categoryRepository.findByName(request.getName());
        if (optionalCategory.isPresent()) {
            throw new
                    IllegalArgumentException("Category with name " + request.getName() + " already exists");
        }
        return categoryRepository.save(createCategory(request));


    }

}
