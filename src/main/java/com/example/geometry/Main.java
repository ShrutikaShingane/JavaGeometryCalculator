
package com.example.geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Geometry Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Select a shape: ");

        int choice = sc.nextInt();
        Shape shape;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            if (radius <= 0) {
                System.out.println("Dimension must be positive.");
                sc.close();
                return;
            }

            shape = new Circle(radius);

        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            if (length <= 0 || width <= 0) {
                System.out.println("Dimensions must be positive.");
                sc.close();
                return;
            }

            shape = new Rectangle(length, width);

        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        shape.printDetails();
        sc.close();
    }
}
