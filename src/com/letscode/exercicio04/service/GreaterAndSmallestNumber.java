package com.letscode.exercicio04.service;

import com.letscode.exercicio04.utils.Reader;

public class GreaterAndSmallestNumber {

    static float[] numbers = new float[5];
    static int i;

    public static void inputNumbers() {
        for (i = 0; i < 5; i++) {
            float number = Reader.scanNumber();
            numbers[i] = number;
        }
    }

    public static float findGreaterNumber() {
        float greaterNumber = numbers[0];
        for (i = 0; i < 5; i++) {
            if (numbers[i] > greaterNumber) {
                greaterNumber = numbers[i];
            }
        }
        return greaterNumber;
    }

    public static float findSmallestNumber() {
        float smallestNumber = numbers[0];
        for (i = 0; i < 5; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }
        return smallestNumber;
    }

    public static float average() {
        return (findGreaterNumber() + findSmallestNumber()) / 2;
    }

}
