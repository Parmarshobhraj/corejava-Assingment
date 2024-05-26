//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
//message.

package module_2;

import java.util.Scanner;

public class Q_02 {

	    public static void main(String[] args) {
	        // Create a Scanner for user input
	        Scanner sc = new Scanner(System.in);

	        // the user to enter a single character
	        System.out.print("Enter a single character: ");
	        String input = sc.nextLine();
	   
	        // Check the input is a single character
	        if (input.length() != 1) {
	            System.out.println("Error: Please enter a single character.");
	        } else {
	            // Get the character from the input
	            char ch = input.charAt(0);

	            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	                // Check if the character is a vowel or consonant
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                    System.out.println(ch + " is a vowel.");
	                } else {
	                    System.out.println(ch + " is a consonant.");
	                }
	            } else {
	                System.out.println("Error: Please enter a valid letter.");	                }
	            }
	        }
	    }
	



