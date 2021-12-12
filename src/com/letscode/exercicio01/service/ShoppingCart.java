package com.letscode.exercicio01.service;

import com.letscode.exercicio01.utils.Reader;

public class ShoppingCart {


    static String[] cart = new String[5];

    public static String[] addToCart() {

        for (int i = 0; i < cart.length; i++) {
            String fruit = Reader.scanFruitName();
            cart[i] = fruit;
        }
        return  cart;
    }

}
