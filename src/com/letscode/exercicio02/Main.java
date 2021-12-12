//Escreva um programa que lê uma palavra e a escreve de volta ao contrário.

package com.letscode.exercicio02;

import com.letscode.exercicio02.utils.Printer;
import com.letscode.exercicio02.utils.Reader;

public class Main {

    public static void main(String[] args) {

        String word = Reader.scanWord();
        Printer.getRevertedWord(word);

    }

}
