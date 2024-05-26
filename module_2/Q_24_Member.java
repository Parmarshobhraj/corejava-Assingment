//Create a class named 'Member' having the following members:
//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary
//It also has a method named 'printSalary' which prints the salary of the members.

package module_2;

public class Q_24_Member {
	    // Data members
	    private String name;
	    private int age;
	    private String phoneNumber;
	    private String address;
	    private double salary;

	    // Method to set member details
	    public void setMemberDetails(String name, int age, String phoneNumber, String address, double salary) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	    }

	    // Method to print salary
	    public void printSalary() {
	        System.out.println("Salary of " + name + " is: " + salary);
	    }

	    public static void main(String[] args) {
	        // Create an object of the Member class
	        Q_24_Member member1 = new Q_24_Member();

	        // Set member details
	        member1.setMemberDetails("Shobhraj", 20, "8160813154", "Ahmedabad", 50000);

	        // Print salary
	        member1.printSalary();
	    }
	}


