//Write a Java program to iterate through all elements in a hash list.

package module_2;

import java.util.HashSet;
import java.util.Iterator;

public class Q_57 {
	    public static void main(String[] args) {
	        // Create a HashSet of integers
	        HashSet<Integer> numbers = new HashSet<>();

	        // Add some integers to the HashSet
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Iterate through the HashSet using an iterator
	        System.out.println("Iterating through the HashSet using an Iterator:");
	        Iterator<Integer> iterator = numbers.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Iterate through the HashSet using an enhanced for loop
	        System.out.println("\nIterating through the HashSet using an enhanced for loop:");
	        for (Integer number : numbers) {
	            System.out.println(number);
	        }
	    }
	}


