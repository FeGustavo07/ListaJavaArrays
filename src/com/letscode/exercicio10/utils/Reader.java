package com.letscode.exercicio10.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static double scanCelsiusDegree() {
        Printer.messageEnterCelsius();
        return input.nextDouble();
    }

}
