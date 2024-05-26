//Write a Java program to reverse elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q_61 {
	    public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some integers to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Print the ArrayList before reversing
	        System.out.println("ArrayList before reversing:");
	        System.out.println(numbers);

	        // Reverse the ArrayList
	        Collections.reverse(numbers);

	        // Print the ArrayList after reversing
	        System.out.println("\nArrayList after reversing:");
	        System.out.println(numbers);
	    }
	}


