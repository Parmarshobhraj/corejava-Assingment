//Write a Java program to iterate through all elements in an array list.

package module_2;

import java.util.ArrayList;

public class Q_47 {

	    public static void main(String[] args) {
	        
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Iterate all elements in the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println(numbers.get(i));
	        }
	    }
	}


