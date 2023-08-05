package com.simon;

public class exception_handling {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            //System.out.println(e.toString());
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Exception handled properly!");
        }
    }
}
