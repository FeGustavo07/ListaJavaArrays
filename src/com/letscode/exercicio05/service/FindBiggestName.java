package com.letscode.exercicio05.service;

import com.letscode.exercicio05.utils.Reader;

public class FindBiggestName {

    static String[] guestList = new String[5];

    public static String[] createGuestList() {
        for (int i = 0; i < guestList.length; i++) {
            String name = Reader.scanName();
            guestList[i] = name;
        }
        return guestList;
    }

    public static String findBiggestName() {
        char[] biggestNameArray = new char[0];
        for (int i = 0; i < guestList.length; i++) {
           char[] names =  guestList[i].toCharArray();
           if (names.length > biggestNameArray.length) {
               biggestNameArray = names;
           }
        }
        String biggetsName = String.copyValueOf(biggestNameArray);
        return biggetsName;
    }

}
