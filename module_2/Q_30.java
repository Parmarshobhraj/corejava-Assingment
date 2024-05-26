//We have to calculate the percentage of marks obtained in three subjects (each out of
//100) by student A and in four subjects (each out of 100) by student B. Create an
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
//other classes 'A' and 'B' each having a method with the same name which returns the
//percentage of the students. The constructor of student A takes the marks in three
//subjects asits parameters and the marks in foursubjects as its parameters forstudent
//B. Create an object for each of the two classes and print the percentage of marks for
//both the students.

package module_2;
abstract class Marks {
    // Abstract method to get percentage of marks
    abstract double getPercentage();
}

class A extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;

    // Constructor to marks for student A
    A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Method to calculate and return the percentage of marks for student A
    double getPercentage() {
        double total = subject1 + subject2 + subject3;
        return (total / 300) * 100;
    }
}

class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    // Constructor to marks for student B
    B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    // Method to calculate and return the percentage of marks for student B
    double getPercentage() {
        double total = subject1 + subject2 + subject3 + subject4;
        return (total / 400) * 100;
    }
}


public class Q_30 {
	public static void main(String[] args) {

        A studentA = new A(85, 90, 78);
        B studentB = new B(88, 76, 90, 85);

        // Printing the percentage of marks for both students
        System.out.println("Percentage of marks for student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for student B: " + studentB.getPercentage() + "%");
    }
}
