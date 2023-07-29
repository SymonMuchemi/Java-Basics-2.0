package com.simon;

public class variables {
    /**
     * starter method; compilation begins here
     * */
    public static void main(String[] args) {
        // primitives - store simple values
        int number1 = 20;
        int number2 = 20;

        double PI = 3.14;
        boolean isTall = false;
        char a = 'A';
        System.out.println(PI);
        System.out.println(isTall);
        System.out.println(a);
        // How to use underscore to make numbers readable
        double double_example = 352_251.125_891;
        int millions = 1_000_000;
        int billions = 1_000_000_000;
        System.out.println(double_example);
        System.out.println(millions);
        System.out.println(billions);
        System.out.println(number1 + number2);
    }
}