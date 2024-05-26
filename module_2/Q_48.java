//Write a Java program to insert an element into the array list at the first position.

package module_2;

import java.util.ArrayList;

public class Q_48 {

	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> fruits = new ArrayList<>();

	        // Add some fruits to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");

	        // Print the ArrayList before insertion
	        System.out.println("ArrayList before insertion:");
	        System.out.println(fruits);

	        // Insert a new fruit at the first position (index 0)
	        fruits.add(0, "Mango");

	        // Print the ArrayList after insertion
	        System.out.println("\nArrayList after insertion:");
	        System.out.println(fruits);
	    }
	}

