//Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.

package com.letscode.exercicio06;

import com.letscode.exercicio06.utils.Printer;
import com.letscode.exercicio06.utils.Reader;

public class Main {

    public static void main(String[] args) {

        String word = Reader.scanWord();
        Printer.getModifiedWord(word);

    }

}
