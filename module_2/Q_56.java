//Write a Java program to append the specified element to the end of a hash set.

package module_2;

import java.util.HashSet;

public class Q_56 {
	    public static void main(String[] args) {
	        // Create a HashSet of integers
	        HashSet<Integer> numbers = new HashSet<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Print the HashSet before adding a new element
	        System.out.println("HashSet before adding a new element:");
	        System.out.println(numbers);

	        // Append a specified element to the HashSet
	        numbers.add(6);

	        // Print the HashSet after adding the new element
	        System.out.println("\nHashSet after adding a new element:");
	        System.out.println(numbers);
	    }
	}


