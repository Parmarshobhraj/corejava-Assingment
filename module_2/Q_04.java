//Write a program in Java to input 5 numbers from keyboard and find their sum and
//average using for loop.

package module_2;

import java.util.Scanner;

public class Q_04 {

	    public static void main(String[] args) {
	    
	        Scanner sc = new Scanner(System.in);

	        int sum = 0;
	        
	        // Loop to input 5 numbers
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Enter number " + i + ": ");
	            int number = sc.nextInt();
	            sum += number; // Add the number to the sum
	        }

	        // Calculate the average
	        double average = sum / 5.0;

	        // Print the sum and average
	        System.out.println("Sum of the 5 numbers is: " + sum);
	        System.out.println("Average of the 5 numbers is: " + average);
	    }
	}


