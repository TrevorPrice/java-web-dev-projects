package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        double radius = input.nextDouble();

        double area = Circle.getArea(radius);
//        double area = Math.PI   * radius * radius;
//        area = Math.round(area * 1000.0) / 1000.0;
        System.out.println("The area of your circle is " + area);
    }
}
