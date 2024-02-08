package com.simon.basics;

import java.util.Scanner;

public class rentalYield {

    static float yieldCalculator(int rent, int propertyValue){
        rent *= 12;
        float rov = (float) rent / propertyValue;
        rov *= 100;

        return rov;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter monthly rent amount: ");
        int rent = in.nextInt();
        System.out.println("Enter property value");
        int value = in.nextInt();

        float ry = yieldCalculator(rent, value);
        System.out.printf("Rental yield: %2f", ry);
    }
}
