package com.simon;

import java.util.Arrays;

public class loops {
    public static void main(String[] args) {
         String[] names = {
                 "Simon",
                 "James",
                 "Nadia",
                 "Sofia",
                 "Alex",
                 "Saleh"
         };

         // for loop (enhanced)
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("######");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        System.out.println();

        // Advanced method
        Arrays.stream(names).forEach(System.out::println);
    }
}
