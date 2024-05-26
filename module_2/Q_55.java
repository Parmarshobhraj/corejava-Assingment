//Write a Java program to shuffle elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q_55 {

	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some integers to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Print the ArrayList before shuffling
	        System.out.println("ArrayList before shuffling:");
	        System.out.println(numbers);

	        // Shuffle the ArrayList
	        Collections.shuffle(numbers);

	        // Print the ArrayList after shuffling
	        System.out.println("\nArrayList after shuffling:");
	        System.out.println(numbers);
	    }
	}

