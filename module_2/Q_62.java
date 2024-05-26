//Write a Java program to extract a portion of an array list.

package module_2;

import java.util.ArrayList;
import java.util.List;

public class Q_62 {
	    public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some integers to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Print the ArrayList before extracting a portion
	        System.out.println("ArrayList before extracting a portion:");
	        System.out.println(numbers);

	        // Extract a portion of the ArrayList (from index 1 to index 3)
	        List<Integer> portion = numbers.subList(1, 4);

	        // Print the extracted portion
	        System.out.println("\nExtracted portion of the ArrayList:");
	        System.out.println(portion);
	    }
	}


