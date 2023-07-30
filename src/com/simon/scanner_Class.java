package com.simon;

import java.time.LocalDate;
import java.util.Scanner;

/*
    program that takes the user's name and prints a greeting
    takes age and calculates the year of birth
 */
public class scanner_Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.printf("Hello %s\n", name);
        System.out.println("How old are you?");
        int age = in.nextInt();
        int YOB = LocalDate.now().minusYears(age).getYear();
        System.out.printf("Year of Birth %d\n", YOB);

        if (age < 18){
            System.out.println("You are a child!");
        }
        else
            System.out.println("You are an adult!");
    }
}
