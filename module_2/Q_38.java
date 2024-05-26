//W.A.J.P to create the validate method that takes integer value as a parameter. If the
//age is less than 18, then throw an Arithmetic Exception otherwise print a message
//welcome to vote.

package module_2;

public class Q_38 {
	// Method to validate age
    public static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            int age = 16; // Example age
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

