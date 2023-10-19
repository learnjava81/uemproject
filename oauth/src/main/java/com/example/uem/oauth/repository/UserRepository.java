package com.example.uem.oauth.repository;

import com.example.uem.oauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    User findByEmail(String email);
}