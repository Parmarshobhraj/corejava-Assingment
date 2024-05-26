//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
//5 units by creating a class named 'Triangle' without any parameter in its constructor.

package module_2;

import java.lang.Math;

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    // Constructor without parameters
    Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    // Method to calculate and print area
    void printArea() {
   
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of Triangle: " + area);
    }

    // Method to calculate and print perimeter
    void printPerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}


public class Q_26_Triangle {
	public static void main(String[] args) {
        // Creating an object of Triangle class
        Triangle triangle = new Triangle();
        triangle.printArea();
        triangle.printPerimeter();
    }
}


