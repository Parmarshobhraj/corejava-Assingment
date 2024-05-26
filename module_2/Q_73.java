//Write a Java program to get a collection view of the values contained in this map.

package module_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Q_73 {
	    public static void main(String[] args) {
	        Map<Integer, String> map = new HashMap<>();
	        // Add some key-value pairs to the map
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");

	        // Get the collection view of values from the map
	        Collection<String> values = map.values();

	        // Print the collection view of values
	        System.out.println("Collection view of values:");
	        System.out.println(values);
	    }
	}


