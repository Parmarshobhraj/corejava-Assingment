//Write a Java program to create a new array list, add some colors (string) and print out
//the collection.

package module_2;

import java.util.ArrayList;

public class Q_46 {

	    public static void main(String[] args) {
	        // Create a ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Print out the collection
	        System.out.println("Colors in the collection:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}

