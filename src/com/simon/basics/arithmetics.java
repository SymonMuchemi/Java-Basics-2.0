package com.simon.basics;

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

        // Special case
        /*
          The number is first printed out then incremented
          */
        num1 = 0;
        System.out.println("Num1 (before increment) = " + num1++);
        System.out.println("Num1 after increment) = " + num1);
        System.out.println();
        System.out.println("Increment then return:");
        System.out.println("num1 = " + (++num1));
        // decrement operator
        /*
          the number is decremented by 1 first then printed out
          */
        System.out.println(num2);
        System.out.println(--num2);
    }
}