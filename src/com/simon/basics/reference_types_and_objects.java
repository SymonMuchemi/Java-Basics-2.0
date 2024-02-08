package com.simon.basics;

import java.awt.*;

public class reference_types_and_objects {
    public static void main(String[] args) {
        Point pointA = new Point(10, 10);
        System.out.println("pointA = " + pointA);
        pointA.move(52, 25);
        System.out.println(pointA);
    }
}
