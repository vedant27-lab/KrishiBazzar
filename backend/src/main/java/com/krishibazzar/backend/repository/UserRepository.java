package com.krishibazzar.backend.repository;

import com.krishibazzar.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
    Optional<User> findByEmails(String email);
    boolean existsByEmail(String email);
    List<User> findByRole(String role);
    List<User> findByNameContainingIgnoreCase(String keyword);
    
}
