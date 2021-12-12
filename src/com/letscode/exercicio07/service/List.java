package com.letscode.exercicio07.service;

import com.letscode.exercicio07.utils.Reader;

public class List {

    static String[] names = new String[5];
    static int[] ages = new int[5];
    static String[] olderPerson = new String[2];
    static String[] youngerPerson = new String[2];

    public static void listName() {
        for (int i = 0; i < 5; i++) {
            String name = Reader.scanName();
            names[i] = name;
            int age = Reader.scanAge();
            ages[i] = age;
        }
    }

    public static String[] findOlder() {
        int i;
        int olderAge = 0;
        int indexName = 0;
        for (i = 0; i < ages.length; i++) {
            if (ages[i] > olderAge) {
                 olderAge = ages[i];
                 indexName = i;
            }
            olderPerson[0] = Integer.toString(olderAge);
            olderPerson[1] = names[indexName];
        }
        return olderPerson;
    }

    public static String[] findYounger() {
        int i;
        int youngerAge = ages[0];
        int indexName = 0;
        for (i = 0; i < ages.length; i++) {
            if (ages[i] < youngerAge) {
                youngerAge = ages[i];
                indexName = i;
            }
            youngerPerson[0] = Integer.toString(youngerAge);
            youngerPerson[1] = names[indexName];
        }
        return youngerPerson;
    }

    public static int average() {
        return (Integer.parseInt(olderPerson[0]) + Integer.parseInt(youngerPerson[0])) / 2;
    }



}
