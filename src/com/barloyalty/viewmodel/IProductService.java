package com.barloyalty.viewmodel;

import com.barloyalty.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> search(String query); // метод для поиска продукта в корзину
    void addProductToCart(String productId);  // метод для добавления продукта в корзину
    void removeProductFromCart(String productId);  //  метод для удаления продукта из корзины
    void checkout();  //  метод для оформления заказа
    void applyDiscountCode(String code);  //  метод для применения скидочного кода
}
