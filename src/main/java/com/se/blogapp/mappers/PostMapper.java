package com.se.blogapp.mappers;

import com.se.blogapp.domain.CreatePostRequest;
import com.se.blogapp.domain.UpdatePostRequest;
import com.se.blogapp.domain.dtos.CreatePostRequestDto;
import com.se.blogapp.domain.dtos.PostDto;
import com.se.blogapp.domain.dtos.UpdatePostRequestDto;
import com.se.blogapp.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}
