//Exercicio do Alan

package com.letscode.exercicio09;

import com.letscode.exercicio09.service.Pyramid;
import com.letscode.exercicio09.utils.Reader;

public class Main {

    public static void main(String[] args) {
        int number = Reader.scanNumber();
        Pyramid.pyramid(number);
    }

}
