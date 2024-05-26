//Write a Java program to Take three numbers from the user and print the greatest
//number.

package module_2;

import java.util.Scanner;

public class Q_01 {
	
	    public static void main(String[] args) {
	        // Create a Scanner for user input
	        Scanner sc = new Scanner(System.in);

	        // the user to enter three numbers
	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();
	        System.out.print("Enter the third number: ");
	        int num3 = sc.nextInt();
	        
	        // find the greatest number
	        int greatest = num1;

	        if (num2 > greatest) {
	            greatest = num2;
	        }

	        if (num3 > greatest) {
	            greatest = num3;
	        }

	        // Print the greatest number
	        System.out.println("The greatest number is: " + greatest);
	    }
	}



