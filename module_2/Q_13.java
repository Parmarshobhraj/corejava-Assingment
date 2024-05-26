//W.A.J.P to get the character at the given index within the String. Original String =
//Tops Technologies! The character at position 0 is T, The character at position 10 is
//o

package module_2;

public class Q_13 {

	    public static void main(String[] args) {
	        // Original string
	        String originalString = "Tops Technologies!";

	        // Index to get the character from
	        int index0 = 0;
	        int index10 = 10;

	        // Get the character at position 0
	        char charAtIndex0 = originalString.charAt(index0);
	        System.out.println("The character at position " + index0 + " is: " + charAtIndex0);

	        // Get the character at position 10
	        char charAtIndex10 = originalString.charAt(index10);
	        System.out.println("The character at position " + index10 + " is: " + charAtIndex10);
	    }
	}

