package module_2;

public class Q_20 {

	    // Method to print an integer
	    public void printn(int num) {
	        System.out.println("Printing integer: " + num);
	    }

	    // Method to print a double
	    public void printn(double num) {
	        System.out.println("Printing double: " + num);
	    }

	    // Method to print a float
	    public void printn(float num) {
	        System.out.println("Printing float: " + num);
	    }

	    // Method to print a long
	    public void printn(long num) {
	        System.out.println("Printing long: " + num);
	    }

	    // Method to print a byte
	    public void printn(byte num) {
	        System.out.println("Printing byte: " + num);
	    }

	    // Method to print a short
	    public void printn(short num) {
	        System.out.println("Printing short: " + num);
	    }

	    // Method to print a char
	    public void printn(char ch) {
	        System.out.println("Printing char: " + ch);
	    }

	    // Method to print a boolean
	    public void printn(boolean bool) {
	        System.out.println("Printing boolean: " + bool);

}
	    public static void main(String[] args) {
	        Q_20 printer = new Q_20();
	        printer.printn(10);
	        printer.printn(3.14);
	        printer.printn(5.67f);
	        printer.printn(10000L);
	        printer.printn((byte) 5);
	        printer.printn((short) 100);
	        printer.printn('A');
	        printer.printn(true);
	    }
	}
