//Write a Java program to compare two sets and retain elements which are same on
//both sets.

package module_2;

import java.util.HashSet;
import java.util.Set;

public class Q_72 {
	    public static void main(String[] args) {
	        // Create two sets
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	        // Add elements to the first set
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);

	        // Add elements to the second set
	        set2.add(2);
	        set2.add(3);
	        set2.add(4);

	        // Retain only the elements that are present in both sets
	        set1.retainAll(set2);

	        // Print the retained elements
	        System.out.println("Elements retained in both sets:");
	        System.out.println(set1);
	    }
	}


