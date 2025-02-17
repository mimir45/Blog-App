package com.se.blogapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false, unique = true)
    private String name;
    @ManyToMany(mappedBy = "tags")
    private Set<Post> posts = new HashSet<>();

}
