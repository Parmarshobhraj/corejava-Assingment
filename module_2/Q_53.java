//Write a Java program to sort a given array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q_53 {
	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print the ArrayList before sorting
	        System.out.println("ArrayList before sorting:");
	        System.out.println(colors);

	        // Sort the ArrayList
	        Collections.sort(colors);

	        // Print the ArrayList after sorting
	        System.out.println("\nArrayList after sorting:");
	        System.out.println(colors);
	    }
	}


