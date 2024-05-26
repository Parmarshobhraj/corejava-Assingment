//Write a Java program to get the number of elements in a hash set.

package module_2;

import java.util.HashSet;

public class Q_58 {
	    public static void main(String[] args) {
	        // Create a HashSet of integers
	        HashSet<Integer> numbers = new HashSet<>();

	        // Add some integers to the HashSet
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Print the HashSet
	        System.out.println("HashSet elements:");
	        System.out.println(numbers);

	        // Get the number of elements in the HashSet
	        int size = numbers.size();

	        // Print the number of elements in the HashSet
	        System.out.println("\nNumber of elements in the HashSet: " + size);
	    }
	}


