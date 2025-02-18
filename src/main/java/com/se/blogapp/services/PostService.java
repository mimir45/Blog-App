package com.se.blogapp.services;

import com.se.blogapp.domain.CreatePostRequest;
import com.se.blogapp.domain.UpdatePostRequest;
import com.se.blogapp.domain.entities.Post;
import com.se.blogapp.domain.entities.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
    void deletePost(UUID id);
}
