package com.barloyalty.updates;

public interface IClientApplication {
    void checkForUpdates();
    void rollbackUpdate();  // метод для отката обновления
}
