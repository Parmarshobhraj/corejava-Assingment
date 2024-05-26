//Write a Java program to replace the second element of an Array List with the
//specified element.

package module_2;

import java.util.ArrayList;

public class Q_70 {
	    public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Add some elements to the ArrayList
	        arrayList.add("apple");
	        arrayList.add("banana");
	        arrayList.add("orange");

	        // Print the ArrayList before replacement
	        System.out.println("ArrayList before replacement:");
	        System.out.println(arrayList);

	        // Replace the second element with "grape"
	        if (arrayList.size() >= 2) {
	            arrayList.set(1, "grape");
	        } else {
	            System.out.println("ArrayList does not have a second element.");
	        }

	        // Print the ArrayList after replacement
	        System.out.println("\nArrayList after replacement:");
	        System.out.println(arrayList);
	    }
	}

