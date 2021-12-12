package com.letscode.exercicio08.utils;

import com.letscode.exercicio08.service.IMC;

public class Printer {

    static final String MESSAGE_ENTER_NAME = "Type your name: ";
    static final String MESSAGE_ENTER_HEIGHT = "Type your height: ";
    static final String MESSAGE_ENTER_WEIGHT = "Type your weight: ";

    public static void messageEnterName() {
        System.out.print(MESSAGE_ENTER_NAME);
    }

    public static void messageEnterHeight() {
        System.out.print(MESSAGE_ENTER_HEIGHT);
    }

    public static void messageEnterWeight() {
        System.out.print(MESSAGE_ENTER_WEIGHT);
    }

    public static void resultIMC(String name, double height, double weight) {
        System.out.printf("%n %s - imc = %.2f - %s %n %n", name, IMC.calculateIMC(height, weight),
                IMC.messageIdealWeight(IMC.calculateIMC(height, weight)));
    }

}
