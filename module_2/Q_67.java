//Write a Java program to convert a hash set to a List/Array List.

package module_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q_67 {
	    public static void main(String[] args) {
	        // Create a HashSet of strings
	        HashSet<String> hashSet = new HashSet<>();

	        // Add some strings to the HashSet
	        hashSet.add("apple");
	        hashSet.add("banana");
	        hashSet.add("orange");

	        // Convert the HashSet to an ArrayList
	        List<String> arrayList = new ArrayList<>(hashSet);

	        // Print the elements of the ArrayList
	        System.out.println("ArrayList elements:");
	        for (String element : arrayList) {
	            System.out.println(element);
	        }
	    }
	}


