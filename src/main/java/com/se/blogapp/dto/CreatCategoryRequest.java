package com.se.blogapp.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatCategoryRequest {
    @NotBlank(message = "Category name is required")
    @Size(min = 2,max = 50 ,message = "Category name must be between {min} and {max} character")
    @Pattern(regexp = "ˆ[\\w\\s-]+$",message = "Category name can only contain letters,numbers ,spaces, and hyphens")
    private String name;
}
