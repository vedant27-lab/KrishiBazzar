package com.krishibazzar.backend.service;

import com.krishibazzar.backend.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
    Optional<User> getUserByEmail(String email);
    boolean emailExists(String email);
    
}
