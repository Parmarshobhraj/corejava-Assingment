//W.A.J.P to compare a given string to the specified character sequence. Comparing
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false

package module_2;

public class Q_15 {
	
	    public static void main(String[] args) {
	        // Given string
	        String givenString = "topsint.com";

	        // Specified character sequences
	        String sequence1 = "topsint.com";
	        String sequence2 = "Topsint.com";

	        // Comparing the given string to the specified character sequences
	        boolean comparison1 = givenString.equals(sequence1);
	        boolean comparison2 = givenString.equals(sequence2);

	        // Printing the comparisons
	        System.out.println("Comparing " + givenString + " and " + sequence1 + ": " + comparison1);
	        System.out.println("Comparing " + givenString + " and " + sequence2 + ": " + comparison2);
	    }
	}

