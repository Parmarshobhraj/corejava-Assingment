//Write a Java program to count the number of key-value (size) mappings in a map.

package module_2;

import java.util.HashMap;

public class Q_60 {
	    public static void main(String[] args) {
	        // Create a HashMap with String keys and Integer values
	        HashMap<String, Integer> hashMap = new HashMap<>();

	        // Associate values with keys in the HashMap
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);
	        hashMap.put("Four", 4);
	        hashMap.put("Five", 5);

	        // Get the number of key-value mappings in the HashMap
	        int size = hashMap.size();

	        // Print the number of key-value mappings in the HashMap
	        System.out.println("Number of key-value mappings in the HashMap: " + size);
	    }
	}

