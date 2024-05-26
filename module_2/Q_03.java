//Write a Java program that takes a year from user and print whether that year is a leap
//year or not. B19. Write a program in Java to display the first 10 natural numbers
//using while loop.

package module_2;

import java.util.Scanner;

public class Q_03 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        
	        int year = sc.nextInt();

	        // Checking the year is a leap year or not
	        if (year % 4 == 0) {
	            
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    
	        int number = 1; // Initialize the starting number

	        // Print the first 10 natural numbers
	        System.out.println("The first 10 natural numbers are:");
	        while (number <= 10) {
	            System.out.println(number);
	            number++;
	        }
	    }
	}

