//Write a Java program to associate the specified value with the specified key in a
//Hash Map.

package module_2;

import java.util.HashMap;

public class Q_59 {
	    public static void main(String[] args) {
	        // Create a HashMap with String keys and Integer values
	        HashMap<String, Integer> hashMap = new HashMap<>();

	        // Associate values with keys in the HashMap
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);
	        hashMap.put("Four", 4);
	        hashMap.put("Five", 5);

	        // Print the HashMap
	        System.out.println("HashMap:");
	        System.out.println(hashMap);
	    }
	}


