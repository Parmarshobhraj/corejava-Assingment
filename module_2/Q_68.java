//Write a Java program to check whether a map contains key-value mappings (empty)
//or not.

package module_2;

import java.util.HashMap;
import java.util.Map;

public class Q_68 {
	    public static void main(String[] args) {
	        // Create a HashMap
	        Map<String, Integer> map = new HashMap<>();

	        // Check if the map is empty
	        boolean isEmpty = map.isEmpty();

	        // Print the result
	        if (isEmpty) {
	            System.out.println("The map is empty.");
	        } else {
	            System.out.println("The map is not empty.");
	        }
	    }
	}

