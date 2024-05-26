//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
//two methods to print the area and perimeter of the rectangle respectively. Its
//constructor having parameters for length and breadth is used to initialize the length
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
//constructor having a parameter for its side (suppose s) calling the constructor of its
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

package module_2;

class Rectangle{
    // Data members
    protected double length;
    protected double breadth;

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print area
    void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate and print perameter
    void printPerameter() {
        double perameter = 2 * (length + breadth);
        System.out.println("Perameter of Rectangle: " + perameter);
    }
}

class Square extends Rectangle {
    // Constructor to initialize side using super keyword
    Square(double side) {
        super(side, side);
        
        }
    void printArea() {
        double area = length * breadth;
        System.out.println("Area of Square: " + area);
    }

    // Method to calculate and print perameter
    void printPerameter() {
        double perameter = 2 * (length + breadth);
        System.out.println("Perameter of Square: " + perameter);
    }
}



public class Q_25_Rectangle {
	
	    public static void main(String[] args) {
	        // Creating an object of Rectangle class
	        Rectangle rectangle = new Rectangle(4, 5);
	        System.out.println("Rectangle:");
	        rectangle.printArea();
	        rectangle.printPerameter();

	        // Creating an object of Square class
	        Square square = new Square(5);
	        System.out.println("\nSquare:");
	        square.printArea();
	        square.printPerameter();
	    }
	}


