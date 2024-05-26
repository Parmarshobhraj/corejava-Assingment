//Write a Java program to compare two array lists.

package module_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_63 {
	    public static void main(String[] args) {
	        // Create two ArrayLists of integers
	        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

	        // Compare the two ArrayLists
	        boolean isEqual = list1.equals(list2);

	        // Print the result of the comparison
	        if (isEqual) {
	            System.out.println("The two ArrayLists are equal.");
	        } else {
	            System.out.println("The two ArrayLists are not equal.");
	        }
	    }
	}


