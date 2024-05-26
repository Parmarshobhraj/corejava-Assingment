//Write a Java program to search an element in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_52 {

	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print the ArrayList
	        System.out.println("ArrayList:");
	        System.out.println(colors);

	        // Create a Scanner object to read input
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter the color to search
	        System.out.print("\nEnter the color to search: ");
	        String searchColor = sc.nextLine();

	        // Search for the element in the ArrayList
	        if (colors.contains(searchColor)) {
	            System.out.println("\nThe color \"" + searchColor + "\" in the ArrayList.");
	        } else {
	            System.out.println("\nThe color \"" + searchColor + "\" is not in the ArrayList.");
	        }

	    }
	}

