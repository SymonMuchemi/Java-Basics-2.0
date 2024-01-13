package com.simon.basics;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // static declaration of arrays
        int[] newArray = new int[5];

        int i = 0, j = 0;
        for (; i < 25; i += 5, j++){
            newArray[j] = i;
        }
        // Proper way of printing array content
        System.out.println(Arrays.toString(newArray));

        //find array length
        System.out.println(newArray.length);

        // Dynamic initialization
        int[] numArray = {0, 25, 258, 468, 69};
        System.out.println(Arrays.toString(numArray));

        // accessing array elements
        numArray[3] = 300;
        System.out.println(Arrays.toString(numArray));

        // array of strings
        String[] names = {"Simon", "James"};
        System.out.println(Arrays.toString(names));

        String[] sirNames = new String[2];
        sirNames[0] = "Michael";
        sirNames[1] = "Godwin";
        System.out.println(Arrays.toString(sirNames));
    }
}
