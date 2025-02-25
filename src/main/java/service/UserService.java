package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    User getUser(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
