package com.example.registration.service;

import com.example.registration.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
