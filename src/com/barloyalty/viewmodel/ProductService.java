package com.barloyalty.viewmodel;

import com.barloyalty.model.Product;

import java.util.List;

public class ProductService implements IProductService {
    private List<Product> products;


    @Override
    public List<Product> search(String query) {
        return null;
    }

    @Override
    public void addProductToCart(String productId) {
        // логика метода
    }

    @Override
    public void removeProductFromCart(String productId) {
        // логика метода
    }

    @Override
    public void checkout() {
        // логика метода
    }

    @Override
    public void applyDiscountCode(String code) {
        // логика метода
    }
}
