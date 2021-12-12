package com.letscode.exercicio08.service;

import com.letscode.exercicio08.utils.Printer;
import com.letscode.exercicio08.utils.Reader;

public class IMC {

    public static void inputData() {
        for (int i = 0; i < 5; i++) {
            String name = Reader.scanName();
            double height = Reader.scanHeight();
            double weight = Reader.scanWeight();
            Printer.resultIMC(name, height, weight);
        }
    }

    public static double calculateIMC(double height, double weight) {
        double imc = weight / (height * height);
        return imc;
    }

    public static String messageIdealWeight(double imc) {
        if (imc >= 18.5 && imc <= 25) {
            return "Ideal weight";
        }
        else {
            return "Out of weight";
        }
    }

}

