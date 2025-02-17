package com.se.blogapp.mappers;

import com.se.blogapp.dto.CategoryDto;
import com.se.blogapp.dto.CreatCategoryRequest;
import com.se.blogapp.model.Category;
import com.se.blogapp.model.Post;
import com.se.blogapp.model.PostStatus;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {
    @Mapping(target = "postCount",source = "posts",qualifiedByName = "calculatePostCount")
    CategoryDto toDto(Category category);

    @Named("calculatePostCount")
    default  long calculatePostCount(List<Post> posts) {
        if (posts == null || posts.isEmpty()) {
            return 0;
        }
        return posts.stream()
                .filter(post -> PostStatus.PUBLISHED.equals(post.getStatus()))
                .count();

    }

    Category toEntity(CreatCategoryRequest request);

}
