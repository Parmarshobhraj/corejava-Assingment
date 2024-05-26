//Write a Java program to print all the elements of an Array List using the position of
//the elements.

package module_2;

import java.util.ArrayList;

public class Q_71 {
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("apple");
	        arrayList.add("banana");
	        arrayList.add("orange");
	        arrayList.add("grape");

	        System.out.println("Elements of the ArrayList with their positions:");
	        for (int i = 0; i < arrayList.size(); i++) {
	            System.out.println("Position " + i + ": " + arrayList.get(i));
	        }
	    }
	}


