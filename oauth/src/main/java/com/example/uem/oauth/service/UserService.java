package com.example.uem.oauth.service;

import com.example.uem.oauth.dto.UserDto;
import com.example.uem.oauth.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}