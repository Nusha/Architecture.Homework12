package com.barloyalty.viewmodel;

import com.barloyalty.model.User;

import java.util.List;

public class UserService  implements IUserService{
    private List<User> users;
    @Override
    public void register(String username, String password) {
// реализация
    }

    @Override
    public User login(String username, String password)  {
        // реализация
        return null;
    }

    @Override
    public void logout(String username) {
        // реализация
    }

    @Override
    public void resetPassword(String username) {
        // реализация
    }

    @Override
    public void updateUserDetails(String username, String details) {
        //реализация
    }

}
