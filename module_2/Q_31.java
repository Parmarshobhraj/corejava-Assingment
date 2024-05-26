//Write a program to print the factorial of a number by defining a method named
//'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
//*(n-1) *n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also, 1! = 1
//0! = 0
package module_2;

import java.util.Scanner;

public class Q_31 {
	
	    // Method to calculate the factorial of a number
	    public static long getFactorial(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Number must be non-negative.");
	        }
	        if (n == 0) {
	            return 1; // 0! is 1 by definition
	        }
	        long factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        
	        try {
	            long result = getFactorial(number);
	            System.out.println("Factorial of " + number + " is: " + result);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


