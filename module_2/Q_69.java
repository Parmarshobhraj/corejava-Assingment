//Write a Java program to increase the size of an array list.

package module_2;

import java.util.ArrayList;

public class Q_69 {
	    public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<Integer> arrayList = new ArrayList<>();

	        // Add some elements to the ArrayList
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);

	        // Print the current capacity of the ArrayList
	        System.out.println("Current capacity: " + arrayList.size());

	        // Increase the size of the ArrayList to accommodate more elements
	        arrayList.ensureCapacity(10);

	        // Print the updated capacity of the ArrayList
	        System.out.println("Updated capacity: " + arrayList.size());
	    }
	}


