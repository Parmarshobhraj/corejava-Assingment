//Write a Java program to convert a hash set to an array.

package module_2;

import java.util.HashSet;

public class Q_66 {
	    public static void main(String[] args) {
	        // Create a HashSet of strings
	        HashSet<String> hashSet = new HashSet<>();

	        // Add some strings to the HashSet
	        hashSet.add("apple");
	        hashSet.add("banana");
	        hashSet.add("orange");

	        // Convert the HashSet to an array
	        String[] array = new String[hashSet.size()];
	        hashSet.toArray(array);

	        // Print the elements of the array
	        System.out.println("Array elements:");
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }
	}


