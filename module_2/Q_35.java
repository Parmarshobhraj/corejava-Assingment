//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
//exception and another one is to handle
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;

package module_2;

public class Q_35 {
	    public static void main(String[] args) {
	        int[] a = new int[5];

	        try {
	            // Attempt to access an element at index 5 and perform division by zero
	            a[5] = 30 / 0;
	        } catch (ArithmeticException e) {
	            // Handle divide by zero exception
	            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handle ArrayIndexOutOfBoundsException
	            System.out.println("ArrayIndexOutOfBounds Exception occurred: " + e.getMessage());
	        }
	    }
	}

