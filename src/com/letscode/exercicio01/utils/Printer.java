package com.letscode.exercicio01.utils;

import com.letscode.exercicio01.service.ShoppingCart;

import java.util.Arrays;

public class Printer {

    final static String MESSAGE_NUMBER_OF_FRUITS = "Type the name of 5 fruits";
    final static String MESSAGE_ENTER_FRUIT = "Type the name of the fruit: ";

    public static void messageNumberOfFruits() {
        System.out.println(MESSAGE_NUMBER_OF_FRUITS);
    }

    public static void messageEnterFruit() {
        System.out.print(MESSAGE_ENTER_FRUIT);
    }

    public static void getCart() {
        System.out.println(Arrays.toString(ShoppingCart.addToCart()));
    }

}
