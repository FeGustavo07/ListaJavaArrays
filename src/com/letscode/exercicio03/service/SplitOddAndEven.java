package com.letscode.exercicio03.service;

import com.letscode.exercicio03.utils.Reader;

public class SplitOddAndEven {

    public static int[] splitOddEven() {
        int[] numbers = new int[5];
        int evenIndex = 4;
        int oddIndex = 0;
        for (int i = 0; i < 5; i++) {
            int number = Reader.scanNumber();
            if (number % 2 == 0) {
                numbers[evenIndex] = number;
                evenIndex --;
            }
            else {
                numbers[oddIndex] = number;
                oddIndex++;
            }
        }
        return numbers;
    }

}
