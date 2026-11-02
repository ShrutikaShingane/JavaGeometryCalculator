
package com.example.geometry;

public abstract class Shape implements Printable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    @Override
    public void printDetails() {
        System.out.println("Shape: " + name);
        System.out.printf("Area: %.2f%n", calculateArea());
    }
}
