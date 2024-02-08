package com.simon.basics;

import java.util.Arrays;

public class array_null_values {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // Arrays.fill(numbers, -1);
        numbers[3] = 25;
        System.out.println(Arrays.toString(numbers));

        // Strings
        String[] names = new String[3];
        names[1] = "James";
        System.out.println(Arrays.toString(names));
    }
}
