package com.simon;

public class arithmetics {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 3;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1 * num2);
        // BODMAS rule applies in arithmetic operations

        System.out.println("Compound operators");
        num1--;
        num2++;

        System.out.println(num1);
        System.out.println(num2);
    }
}