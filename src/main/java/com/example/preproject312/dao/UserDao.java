package com.example.preproject312.dao;


import com.example.preproject312.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    List<User> getAllUser();

    void userEditor(User user, Long id);
}
