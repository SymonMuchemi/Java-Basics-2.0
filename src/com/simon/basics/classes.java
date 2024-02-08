package com.simon.basics;

public class classes {
    static class Lens{
        String brand, focalLength;
        boolean isPrime;
        // Constructor - use to create objects
        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

    public static void main(String[] args) {
        // Object - class instance
        Lens lens1 = new Lens("Kanon",
                "82mm",
                true);
        Lens len2 = new Lens("Sony",
                    "24 - 70mm",
                    false);
        System.out.println("Lens1");
        System.out.println(lens1.brand);
        System.out.println(lens1.focalLength);
        System.out.println(lens1.isPrime);
        System.out.println("Lens2");
        System.out.println(len2.brand);
        System.out.println(len2.focalLength);
        System.out.println(len2.isPrime);
    }
}
