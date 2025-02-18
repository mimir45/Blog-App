package com.se.blogapp.services;

import com.se.blogapp.domain.entities.Category;
import com.se.blogapp.domain.entities.Category;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
    void deleteCategory(UUID id);
    Category getCategoryById(UUID id);
}
