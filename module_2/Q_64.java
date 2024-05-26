//Write a Java program of swap two elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q_64 {
	    public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some integers to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Print the ArrayList before swapping elements
	        System.out.println("ArrayList before swapping elements:");
	        System.out.println(numbers);

	        // Swap elements at index 1 and index 3
	        Collections.swap(numbers, 1, 3);

	        // Print the ArrayList after swapping elements
	        System.out.println("\nArrayList after swapping elements:");
	        System.out.println(numbers);
	    }
	}


