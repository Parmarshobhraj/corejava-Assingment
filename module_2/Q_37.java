package module_2;

public class Q_37 {
	    public static void main(String[] args) {
	   
	        if (args.length != 2) {
	            System.out.println("Usage: java DivisionOperation <num1> <num2>");
	            return;
	        }

	        try {
	            // Parse command-line arguments to integers
	            int num1 = Integer.parseInt(args[0]);
	            int num2 = Integer.parseInt(args[1]);

	            // Perform division operation
	            int result = num1 / num2;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            // Handle arithmetic exception (division by zero)
	            System.out.println("Exception occurred: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            // Handle number format exception (invalid input format)
	            System.out.println("Invalid input format: " + e.getMessage());
	        }
	    }
	}


