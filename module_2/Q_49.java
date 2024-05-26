//Write a Java program to retrieve an element (at a specified index) from a given array
//list.

package module_2;

import java.util.ArrayList;

public class Q_49 {

	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	     
	        int index = 2; 
	        if (index >= 0 && index < numbers.size()) {
	            int element = numbers.get(index);
	            System.out.println("Element at index " + index + ": " + element);
	        } else {
	            System.out.println("Invalid index. Index should be between 0 and " + (numbers.size() - 1));
	        }
	    }
	}


