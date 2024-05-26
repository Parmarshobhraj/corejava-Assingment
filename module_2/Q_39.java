//W.A.J.P to create a custom exception if Customer withdraw amount which is greater
//than account balance then program will show custom exception otherwise amount
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
//2500
package module_2;
//Custom exception class for insufficient balance
class InsufficientBalanceException extends Exception {
 // Constructor with a message parameter
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//Account class representing a customer account
class Account {
 private double balance;

 // Constructor to initialize account balance
 public Account(double balance) {
     this.balance = balance;
 }

 // Method to withdraw amount
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         // Throw custom exception if withdraw amount is greater than balance
         throw new InsufficientBalanceException("Sorry, insufficient balance, you need more 500 Rs.To perform this transaction.");
     } else {
         // Deduct amount from account balance
         balance -= amount;
         System.out.println("Amount withdrawn: " + amount);
         System.out.println("Remaining balance: " + balance);
     }
 }
}


public class Q_39 {
	public static void main(String[] args) {
	     Account account = new Account(2000); // Initial account balance
	     
	     // Withdraw amount
	     double withdrawAmount = 2500;
	     try {
	         account.withdraw(withdrawAmount);
	     } catch (InsufficientBalanceException e) {
	         // Handle custom exception
	         System.out.println("Exception occurred: " + e.getMessage());
	     }
	 }
	}

