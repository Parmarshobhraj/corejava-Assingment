//Write a Java program to update specific array element by given element.

package module_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_50 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some numbers to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Print the ArrayList before update
	        System.out.println("ArrayList before update:");
	        System.out.println(numbers);

	        // Get the index and new value from the user
	        System.out.print("Enter the index of the element you want to update: ");
	        int index = sc.nextInt();

	        System.out.print("Enter the new value: ");
	        int newValue = sc.nextInt();

	        // Update the element at the specified index
	        if (index >= 0 && index < numbers.size()) {
	            numbers.set(index, newValue);
	            System.out.println("\nElement at index " + index + " updated to: " + newValue);
	        } else {
	            System.out.println("\nInvalid index. Index should be between 0 and " + (numbers.size() - 1));
	        }

	        // Print the ArrayList after update
	        System.out.println("\nArrayList after update:");
	        System.out.println(numbers);

	        
	    }
	}


