//We have to calculate the area of a rectangle, a square and a circle. Create an abstract
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
//area of rectangle, square and circle respectively. Create an object of class 'Area' and
//call all the three methods. I3. Write a program which will ask the user to enter his/her
//marks (out of 100). Define a method that will display grades according to the marks
//entered as below:
//Marks Grade
//1-100 A
//1-90 B
//1-80 B
//1-70 C
//1-60 D
//41-50 DD
//40 Fail


package module_2;

import java.util.Scanner;

abstract class Shape {
    // Abstract methods
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double SquareArea(double side) {
        return side * side;
    }

    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area area = new Area();

        // Calculate and print the area of a rectangle
        double rectangleLength = 5;
        double rectangleBreadth = 3;
        System.out.println("Rectangle Area: " + area.RectangleArea(rectangleLength, rectangleBreadth));

        // Calculate and print the area of a square
        double squareSide = 4;
        System.out.println("Square Area: " + area.SquareArea(squareSide));

        // Calculate and print the area of a circle
        double circleRadius = 2.5;
        System.out.println("Circle Area: " + area.CircleArea(circleRadius));
    }
}



public class Q_32 {
	
	    // Method to display grades based on marks
	    public static void displayGrade(int marks) {
	        if (marks >= 91 && marks <= 100) {
	            System.out.println("Grade: A");
	        } else if (marks >= 81 && marks <= 90) {
	            System.out.println("Grade: B");
	        } else if (marks >= 71 && marks <= 80) {
	            System.out.println("Grade: B");
	        } else if (marks >= 61 && marks <= 70) {
	            System.out.println("Grade: C");
	        } else if (marks >= 51 && marks <= 60) {
	            System.out.println("Grade: D");
	        } else if (marks >= 41 && marks <= 50) {
	            System.out.println("Grade: DD");
	        } else if (marks <= 40) {
	            System.out.println("Grade: Fail");
	        } else {
	            System.out.println("Invalid marks entered.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your marks (out of 100): ");
	        int marks = sc.nextInt();
	        sc.close();

	        displayGrade(marks);
	    }
	}


