//W.A.J. P to demonstrate try catch block, 
//Take two numbers from the user and perform the division operation and handle
//Arithmetic Exception. O/P- Enter two numbers: 10 0
//Exception in thread main java.lang.ArithmeticException:/ by zero

package module_2;

import java.util.Scanner;

public class Q_34 {

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter two numbers: ");
	            int num1 = sc.nextInt();
	            int num2 = sc.nextInt();

	            // Perform division operation
	            int result = num1 / num2;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        } finally {
	            // Close the scanner
	            sc.close();
	        }
	    }
	}

}
