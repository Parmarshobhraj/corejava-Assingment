//Write a Java program to copy one array list into another.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q_54 {
	    public static void main(String[] args) {
	        ArrayList<String> originalList = new ArrayList<>();
	        originalList.add("Red");
	        originalList.add("Green");
	        originalList.add("Blue");
	        originalList.add("Yellow");
	        originalList.add("Purple");

	        // Print the original ArrayList
	        System.out.println("Original ArrayList:");
	        System.out.println(originalList);

	        // Create another ArrayList to copy the elements into
	        ArrayList<String> copyList = new ArrayList<>(originalList.size());
	        
	        // Initialize the copyList with null values to match the size of the originalList
	        for (int i = 0; i < originalList.size(); i++) {
	            copyList.add(null);
	        }

	        // Use Collections.copy() to copy elements from originalList to copyList
	        Collections.copy(copyList, originalList);

	        // Print the copied ArrayList
	        System.out.println("\nCopied ArrayList:");
	        System.out.println(copyList);
	    }
	}


