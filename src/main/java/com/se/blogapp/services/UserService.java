package com.se.blogapp.services;

import com.se.blogapp.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
