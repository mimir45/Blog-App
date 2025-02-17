package com.se.blogapp.dto;

import com.se.blogapp.model.Category;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private UUID id;
    private String name;
    private long postCount;


}
