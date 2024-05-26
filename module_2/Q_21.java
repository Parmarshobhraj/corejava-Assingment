//Create a class to print an integer and a character with two methods having the same
//name but different sequence of the integer and the character parameters. For
//example, if the parameters of the first method are of the form (int n, char c), then
//that of the second method will be of the form (char c, int n).
package module_2;

public class Q_21 {
	
	    // Method-1 print an integer followed by a character
	    public void print(int num, char ch) {
	        System.out.println("Printing integer followed by character: " + num + ", " + ch);
	    }

	    // Method-2 print a character followed by an integer
	    public void print(char ch, int num) {
	        System.out.println("Printing character followed by integer: " + ch + ", " + num);
	    }

	    public static void main(String[] args) {
	        Q_21 printer = new Q_21();
	        
	        // Calling the first method
	        printer.print(10, 'A');
	        
	        // Calling the second method
	        printer.print('B', 20);
	    }
	}


