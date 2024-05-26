//W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
//block. try {
//try
//{//code}
//catch (Exception e)
//{//code}
//catch (Exception e)
//{//code}

package module_2;

public class Q_36 {
		    public static void main(String[] args) {
	        try {
	            try {
	                int[] a = new int[5];
	                // Attempt to access an element at index 5 and perform division by zero
	                a[5] = 30 / 0;
	            } catch (ArrayIndexOutOfBoundsException e) {
	                // Handle ArrayIndexOutOfBoundsException
	                System.out.println("Inner catch 1: ArrayIndexOutOfBounds Exception occurred: " + e.getMessage());
	            }
	        } catch (Exception e) {
	            // Handle exceptions other than ArrayIndexOutOfBoundsException
	            System.out.println("Outer catch: Exception occurred: " + e.getMessage());
	        }
	    }
}
	


