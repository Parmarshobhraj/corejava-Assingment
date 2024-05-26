//Write a programin Java to display the pattern like right angle triangle with a number.
//1
//12
//123
//1234
//12345

package module_2;

public class Q_05 {

	    public static void main(String[] args) {
	        int rows = 5; // Number of rows 
	        
	        for (int i = 1; i <= rows; i++) {
	            
	        	// Loop to print numbers in row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j); // Print the number
	            }
	            System.out.println(); // print Snext line after row
	        }
	    }
	}

