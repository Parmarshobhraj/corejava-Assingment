//Print the sum, difference and product of two complex numbers by creating a class
//named 'Complex' with separate methods for each operation whose real and
//imaginary parts are entered by user

package module_2;

import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Method set real and imaginary parts
    void setComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method add two complex numbers
    void add(Complex num2) {
        double sumReal = this.real + num2.real;
        double sumImaginary = this.imaginary + num2.imaginary;
        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i");
    }

    // Method subtract two complex numbers
    void subtract(Complex num2) {
        double diffReal = this.real - num2.real;
        double diffImaginary = this.imaginary - num2.imaginary;
        System.out.println("Difference: " + diffReal + " + " + diffImaginary + "i");
    }

    // Method multiply two complex numbers
    void multiply(Complex num2) {
        double productReal = (this.real * num2.real) - (this.imaginary * num2.imaginary);
        double productImaginary = (this.real * num2.imaginary) + (this.imaginary * num2.real);
        System.out.println("Product: " + productReal + " + " + productImaginary + "i");
    }
}


public class Q_27_Complex {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // first complex number
	        System.out.println("Enter the real part of the first complex number:");
	        double real1 = sc.nextDouble();
	        System.out.println("Enter the imaginary part of the first complex number:");
	        double imaginary1 = sc.nextDouble();

	        // second complex number
	        System.out.println("Enter the real part of the second complex number:");
	        double real2 = sc.nextDouble();
	        System.out.println("Enter the imaginary part of the second complex number:");
	        double imaginary2 = sc.nextDouble();

	        // Creating objects of Complex class
	        Complex num1 = new Complex();
	        Complex num2 = new Complex();

	        // values for first and second complex numbers
	        num1.setComplex(real1, imaginary1);
	        num2.setComplex(real2, imaginary2);

	        System.out.println("Performing operations on complex numbers:");
	        num1.add(num2);
	        num1.subtract(num2);
	        num1.multiply(num2);
	    }
	}

