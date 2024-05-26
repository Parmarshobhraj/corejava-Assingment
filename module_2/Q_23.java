//Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class
package module_2;

class Parent {
 // Method message for parent class
 public void printMessage() {
     System.out.println("This is a parent class");
 }
}

//Subclass extending Parent class
class Child extends Parent {
 // Method message for child class
 public void printMessage() {
     System.out.println("This is a child class");
 }
}

public class Q_23 {
	public static void main(String[] args) {
	     // Create an object of the parent class
	     Parent parentObj = new Parent();
	     // Call method of the parent class
	     parentObj.printMessage();

	     // Create an object of the child class
	     Child childObj = new Child();
	     // Call method of the child class
	     childObj.printMessage();

	     // Call method of the parent class using the object of the child class
	     childObj.printMessage();
	}
}

