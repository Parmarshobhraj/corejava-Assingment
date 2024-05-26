//W.A.J.P to start the same Thread twice by calling start () method twice. Test
//ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();

package module_2;

class TestThreadTwice1 extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}


public class Q_44 {
	
	    public static void main(String[] args) {
	        // Create a thread instance
	        TestThreadTwice1 t1 = new TestThreadTwice1();
	        
	        // Start the thread twice
	        t1.start();
	        t1.start(); // Attempting to start the same thread instance twice
	    }
	}

