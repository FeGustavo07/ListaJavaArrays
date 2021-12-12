//Exercicio dos graus celsius

package com.letscode.exercicio10;

import com.letscode.exercicio10.service.Degree;
import com.letscode.exercicio10.utils.Reader;

public class Main {

    public static void main(String[] args) {

        double celsius = Reader.scanCelsiusDegree();
        Degree.messageOfWeather(celsius);

    }

}
