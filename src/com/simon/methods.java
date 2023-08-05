package com.simon;

import java.util.Locale;
/*
    Methods contain the following:
        - Access modifiers
        - optional static
        - return type
        - name
        - optional parameters
        - optional return value
*/
public class methods {
    private static int addNumbers(int a, int b){
        return (a + b);
    }

    public static void main(String[] args) {
        int result = addNumbers(10, 34);
        int result2 = addNumbers(110, 4);

        System.out.println(result);
        System.out.println(result2);

        System.out.println("Built in methods");
        String name = "Simon";
        String brand = "Muchemi";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(brand.lastIndexOf("m"));
        System.out.println(brand.startsWith("c"));
        System.out.println(brand.endsWith("i"));

    }
}
