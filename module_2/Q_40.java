//W.A.J.P to create a class Student with attributes roll no, name, age and course.
//Initialize values through parameterized constructor. If age of student is not in
//between 15 and 21 then generate user defined exception
//"AgeNotWithinRangeException". If name contains numbers or special symbols
//raise exception "NameNotValidException". Define the two exception classes.

package module_2;

//Custom exception for age not within the valid range
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Custom exception for invalid name
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor to initialize student attributes
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
     }
     if (!name.matches("[a-zA-Z]+")) {
         throw new NameNotValidException("Name contains invalid characters. Only alphabets are allowed.");
     }
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 // Method to display student details
 public void display() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

public class Q_40 {
	public static void main(String[] args) {
	     try {
	         // Example of a valid student
	         Student student1 = new Student(101, "JohnDoe", 18, "Computer Science");
	         student1.display();
	         
	         // Example of invalid age
	         // Student student2 = new Student(102, "JaneDoe", 14, "Mathematics");

	         // Example of invalid name
	         // Student student3 = new Student(103, "Jane123", 19, "Physics");
	     } catch (AgeNotWithinRangeException | NameNotValidException e) {
	         System.out.println("Exception occurred: " + e.getMessage());
	     }
	 }
}
	

