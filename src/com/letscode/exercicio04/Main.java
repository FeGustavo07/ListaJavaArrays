//Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.

package com.letscode.exercicio04;

import com.letscode.exercicio04.service.GreaterAndSmallestNumber;
import com.letscode.exercicio04.utils.Printer;

public class Main {

    public static void main(String[] args) {

        GreaterAndSmallestNumber.inputNumbers();
        Printer.messageResults();

    }

}
