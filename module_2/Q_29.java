//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
//method by creating an object of each of the three classes.

package module_2;

abstract class Bank {
    // Abstract method to get balance
    abstract int getBalance();
}

class BankA extends Bank {
    // Method to get balance for BankA
    int getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    // Method to get balance for BankB
    int getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    // Method to get balance for BankC
    int getBalance() {
        return 2000;
    }
}


public class Q_29 {
	public static void main(String[] args) {
        // Creating objects of each bank
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}

