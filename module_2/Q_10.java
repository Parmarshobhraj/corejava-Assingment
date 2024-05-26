//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555

package module_2;

import java.util.Scanner;

public class Q_10 {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        
	        int n = sc.nextInt();

	        // Compute the value of n+nn+nnn
	        int nn = n * 11; // nn = n + n*10
	        int nnn = n * 111; // nnn = n + n*10 + n*100
	        int result = n + nn + nnn;

	        // Print the result
	        System.out.println("The result of " + n + " + " + nn + " + " + nnn + " is: " + result);
	    }
	}


