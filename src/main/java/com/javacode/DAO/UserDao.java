package com.javacode.DAO;

import com.javacode.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsersList();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUser(int id);
}
