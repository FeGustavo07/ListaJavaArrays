package com.letscode.exercicio10.service;

public class Degree {

    public static void messageOfWeather(double celsius) {
        if (celsius < 18) {
            System.out.println("Too cold");
        }
        else if (celsius > 30) {
            System.out.println("Too hot");
        }
        else {
            System.out.println("Nice weather");
        }
    }

}
