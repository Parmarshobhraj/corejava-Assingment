//Write a Java program to count the letters, spaces, numbers and other characters of
//an input string.

package module_2;

import java.util.Scanner;

public class Q_08 {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        
	        String input = sc.nextLine();

	        // Initialize counters
	        int letterCount = 0;
	        int spaceCount = 0;
	        int numberCount = 0;
	        int otherCount = 0;

	        // Loop for check character in the string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isLetter(ch)) {
	                letterCount++;
	            } else if (Character.isDigit(ch)) {
	                numberCount++;
	            } else if (Character.isWhitespace(ch)) {
	                spaceCount++;
	            } else {
	                otherCount++;
	            }
	        }

	        // Print the counts
	        System.out.println("Letters: " + letterCount);
	        System.out.println("Spaces: " + spaceCount);
	        System.out.println("Numbers: " + numberCount);
	        System.out.println("Other characters: " + otherCount);
	    }
	}

