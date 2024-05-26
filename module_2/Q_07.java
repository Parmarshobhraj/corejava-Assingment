//Write a Java program that reads a positive integer and count the number of digitsthe
//number.

package module_2;

import java.util.Scanner;

public class Q_07 {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);

	        // the user to enter a positive integer
	        System.out.print("Enter a positive integer: ");
	        int number = sc.nextInt();

	        // Check if the entered number is positive
	        if (number <= 0) {
	            System.out.println("Error: Please enter a positive integer.");
	        } else {
	            // Count the number of digits
	            int count = 0;
	            while (number != 0) {
	                number /= 10; // Remove the last digit
	                count++; 
	            }

	            // Print the number of digits
	            System.out.println("The number of digits is: " + count);
	        }
	    }
	}

