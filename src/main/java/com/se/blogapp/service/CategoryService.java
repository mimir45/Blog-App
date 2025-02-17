package com.se.blogapp.service;

import com.se.blogapp.dto.CategoryDto;
import com.se.blogapp.dto.CreatCategoryRequest;
import com.se.blogapp.model.Category;
import com.se.blogapp.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category>getAllCategories() {
        return categoryRepository.findAllWithPostCount();
    }

    @Transactional
    public Category createCategory(Category request) {
        Optional<Category> optionalCategory = categoryRepository.findByName(request.getName());
        if (optionalCategory.isEmpty()) {
           return categoryRepository.save(request);
        }

        throw new RuntimeException("Category name already exists");


    }

    public String deleteCategory(UUID id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isEmpty()) {
            throw new RuntimeException("Category not found");
        }
         categoryRepository.delete(optionalCategory.get());
        return "Category deleted";

    }
}
