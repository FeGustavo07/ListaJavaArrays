package com.letscode.exercicio09.service;

public class Pyramid {

    public static void pyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
