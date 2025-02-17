package com.se.blogapp.repository;

import com.se.blogapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    @Query("SELECT c FROM Category c left join fetch c.posts")
    List<Category> findAllWithPostCount();
    Optional<Category>  findByName(String name);
}
