
# Geometry Calculator

## Description
A simple console-based Java application that calculates the area of a Circle or Rectangle.

## Features
- Calculate the area of a circle.
- Calculate the area of a rectangle.
- Use an interface and an abstract class.
- Display shape details and calculated area.
- Validate positive dimensions.

## Technologies Used
- Java 11
- Eclipse IDE
- Apache Maven

## Project Structure
```text
GeometryCalculator/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/example/geometry/
                ├── Printable.java
                ├── Shape.java
                ├── Circle.java
                ├── Rectangle.java
                └── Main.java
```

## How to Run
1. Import the project into Eclipse as an Existing Maven Project.
2. Open `Main.java`.
3. Right-click and select Run As → Java Application.
4. Choose Circle or Rectangle and enter the required dimensions.

## Example Output
```text
Geometry Calculator
1. Circle
2. Rectangle
Select a shape: 1
Enter radius: 5
Shape: Circle
Area: 78.54
```

## Concepts Demonstrated
- Java interfaces
- Abstract classes
- Inheritance
- Method overriding
- Polymorphism
- Scanner for user input
