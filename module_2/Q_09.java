//write a Java program to print the ASCII value of a given character

package module_2;

import java.util.Scanner;

public class Q_09 {
	
	public static void main(String[] args) {
	       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        char character = sc.next().charAt(0);

        // Get the ASCII value of the character
        int asciiValue = (int) character;

        // Print the ASCII value
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
    }
}


