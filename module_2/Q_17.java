//W.A.J.P to check whether a given string starts with the contents of another string.
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False I3.

package module_2;

public class Q_17 {
	
	    public static void main(String[] args) {
	        // Given strings
	        String givenString1 = "Red is favorite color.";
	        String givenString2 = "Orange is also my favorite color.";

	        // Contents to check
	        String checkContent1 = "Red";
	        String checkContent2 = "Red";

	        // Check whether the given strings start with the contents
	        boolean startsWithContent1 = givenString1.startsWith(checkContent1);
	        boolean startsWithContent2 = givenString2.startsWith(checkContent2);

	        // Printing the results
	        System.out.println("\"" + givenString1 + "\" starts with \"" + checkContent1 + "\"? " + startsWithContent1);
	        System.out.println("\"" + givenString2 + "\" starts with \"" + checkContent2 + "\"? " + startsWithContent2);
	    }
	}


