//Write a Java program to remove the third element from an array list.

package module_2;

import java.util.ArrayList;

public class Q_51 {

	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print the ArrayList before removal
	        System.out.println("ArrayList before removal:");
	        System.out.println(colors);

	        // Remove the third element (index 2)
	        if (colors.size() > 2) {
	            colors.remove(2);
	            System.out.println("\nThird element removed.");
	        } else {
	            System.out.println("\nThe ArrayList does not have a third element to remove.");
	        }

	        // Print the ArrayList after removal
	        System.out.println("\nArrayList after removal:");
	        System.out.println(colors);
	    }
	}


