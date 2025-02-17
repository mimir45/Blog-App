package com.se.blogapp.controller;

import com.se.blogapp.dto.CategoryDto;
import com.se.blogapp.dto.CreatCategoryRequest;
import com.se.blogapp.mappers.CategoryMapper;
import com.se.blogapp.model.Category;
import com.se.blogapp.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;
    public CategoryController(CategoryService categoryService, CategoryMapper categoryMapper) {
        this.categoryService = categoryService;
        this.categoryMapper = categoryMapper;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategories() {
        List<CategoryDto> categories = categoryService.getAllCategories().stream().map(categoryMapper::toDto).toList();
        return ResponseEntity.ok(categories);
    }
    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody  CreatCategoryRequest creatCategoryRequest) {
        Category category =  categoryMapper
        return ResponseEntity.created(categoryMapper.toDto(categoryService.createCategory(creatCategoryRequest)) );
    }


}
