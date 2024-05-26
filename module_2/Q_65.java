//Write a Java program to join two array lists.

package module_2;

import java.util.ArrayList;
import java.util.List;

public class Q_65 {
	    public static void main(String[] args) {
	        // Create two ArrayLists of integers
	        ArrayList<Integer> list1 = new ArrayList<>();
	        ArrayList<Integer> list2 = new ArrayList<>();

	        // Add some integers to the first ArrayList
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        // Add some integers to the second ArrayList
	        list2.add(4);
	        list2.add(5);
	        list2.add(6);

	        // Create a new ArrayList to store the joined lists
	        ArrayList<Integer> joinedList = new ArrayList<>();

	        // Add all elements from the first list to the joined list
	        joinedList.addAll(list1);

	        // Add all elements from the second list to the joined list
	        joinedList.addAll(list2);

	        // Print the joined list
	        System.out.println("Joined ArrayList:");
	        System.out.println(joinedList);
	    }
	}


