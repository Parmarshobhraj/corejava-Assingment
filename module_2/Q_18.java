//W.A.J.P to find all interleaving of given strings.

package module_2;

public class Q_18 {
	    public static void main(String[] args) {
	        String str1 = "AB";
	        String str2 = "CD";

	        System.out.println("Interleavings of \"" + str1 + "\" and \"" + str2 + "\":");
	        findInterleavings(str1, str2, "", 0, 0);
	    }

	    public static void findInterleavings(String str1, String str2, String interleaved, int i, int j) {
	        if (i == str1.length() && j == str2.length()) {
	            System.out.println(interleaved);
	            return;
	        }

	        if (i < str1.length()) {
	            findInterleavings(str1, str2, interleaved + str1.charAt(i), i + 1, j);
	        }

	        if (j < str2.length()) {
	            findInterleavings(str1, str2, interleaved + str2.charAt(j), i, j + 1);
	        }
	    }
	}



