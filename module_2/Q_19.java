//W.A.J.P to find the second most frequent character in a given string. The given string
//is: successes The second most frequent char in the string is: c

package module_2;

public class Q_19 {
	
	    public static char findSecondMostFrequentChar(String str) {
	        int[] charFrequency = new int[256]; // ASCII characters

	        // Count the frequency of each character in the string
	        for (char c : str.toCharArray()) {
	            charFrequency[c]++;
	        }

	        int maxFreq = Integer.MIN_VALUE;
	        int secondMaxFreq = Integer.MIN_VALUE;
	        char secondMostFreqChar = '\0';

	        // Find the second most frequent character
	        for (int i = 0; i < charFrequency.length; i++) {
	            int freq = charFrequency[i];
	            if (freq > maxFreq) {
	                secondMaxFreq = maxFreq;
	                maxFreq = freq;
	                secondMostFreqChar = (char) i;
	            } else if (freq > secondMaxFreq && freq < maxFreq) {
	                secondMaxFreq = freq;
	                secondMostFreqChar = (char) i;
	            }
	        }

	        return secondMostFreqChar;
	    }

	    public static void main(String[] args) {
	        String inputString = "successes";
	        char secondMostFreqChar = findSecondMostFrequentChar(inputString);
	        System.out.println("The second most frequent char in the string is: " + secondMostFreqChar);
	    }
	}


