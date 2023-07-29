package com.simon;

public class methods {
    /*
        Methods contain the following:
            - Access modifiers
            - optional static
            - return type
            - name
            - optional parameters
            - optional return value
    */


    private static int addNumbers(int a, int b){
        return (a + b);
    }

    public static void main(String[] args) {
        int result = addNumbers(10, 34);
        int result2 = addNumbers(110, 4);

        System.out.println(result);
        System.out.println(result2);
    }
}
