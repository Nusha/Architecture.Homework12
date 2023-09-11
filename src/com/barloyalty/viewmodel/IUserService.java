package com.barloyalty.viewmodel;

import com.barloyalty.model.User;

public interface IUserService {
    void register(String username, String password); // метод для регистрации пользователя
    User login(String username, String password); // метод для авторизации пользователя
    void logout(String username);  // метод для выхода из системы
    void resetPassword(String username);  //  метод для сброса пароля
    void updateUserDetails(String username, String details);  // метод для обновления информации о пользователе
}
