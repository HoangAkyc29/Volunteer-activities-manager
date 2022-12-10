package com.example.demo1_pbl4.service;

import com.example.demo1_pbl4.model.Event;
import com.example.demo1_pbl4.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long userId);

    User insertUser(User user);

    void updateUser(User user);

    boolean deleteUser(Long userId);
    public List<User> search(String keyword);

    boolean checkLogin(String username, String password);

    User findUserByUsername(String usernane);


}
