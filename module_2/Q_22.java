//Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side
//of square.

package module_2;

public class Q_22 {
	
	    // Method to calculate the area of a rectangle
	    public void calculateArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    // Method to calculate the area of a square
	    public void calculateArea(int side) {
	        int area = side * side;
	        System.out.println("Area of Square: " + area);
	    }

	    public static void main(String[] args) {
	        Q_22 calculator = new Q_22();
	        
	        // Calculate the area of a rectangle
	        calculator.calculateArea(5, 10);
	        
	        // Calculate the area of a square
	        calculator.calculateArea(7);
	    }
	}


