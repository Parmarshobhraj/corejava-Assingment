//W.A.J.P to check whether a given string ends with the contents of another string.
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True

package module_2;

public class Q_16 {
	
	    public static void main(String[] args) {
	        // Given strings
	        String givenString1 = "Java Exercises";
	        String givenString2 = "Java Exercise";

	        // Contents to check
	        String checkContent1 = "se";
	        String checkContent2 = "se";

	        // Check the given strings end with the contents
	        boolean endsWithContent1 = givenString1.endsWith(checkContent1);
	        boolean endsWithContent2 = givenString2.endsWith(checkContent2);

	        // Printing the results
	        System.out.println("\"" + givenString1 + "\" ends with \"" + checkContent1 + "\"? " + endsWithContent1);
	        System.out.println("\"" + givenString2 + "\" ends with \"" + checkContent2 + "\"? " + endsWithContent2);
	    }
	}

