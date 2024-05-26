//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
//having a method with the same name 'message' that prints "This is first subclass"
//and "This is second subclass" respectively. Call the methods 'message' by creating
//an object for each subclass.

package module_2;

abstract class Parent {
    // Abstract method message
    abstract void message();
}

class FirstSubclass extends Parent {
    // Implement the message method
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    // Implement the message method
    void message() {
        System.out.println("This is second subclass");
    }
}

public class Q_28 {

	public static void main(String[] args) {
        // Create objects for each subclass
        FirstSubclass firstSubclass = new FirstSubclass();
        SecondSubclass secondSubclass = new SecondSubclass();

        // Call the 'message' method for each subclass
        firstSubclass.message();
        secondSubclass.message();
	    }
	}


