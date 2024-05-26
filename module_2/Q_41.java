//W.A.J. P to create one thread by implementing Runnable interface in
//Class.

package module_2;

//Class for Runnable interface
class MyRunnable implements Runnable {
// run method of the Runnable interface
 public void run() {
     // Task to be performed by the thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread is running: " + i);
         try {
             // Adding a delay to simulate some task
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted.");
         }
     }
 }
}

public class Q_41 {
	
		 public static void main(String[] args) {
		 
		     MyRunnable myRunnable = new MyRunnable();
		     Thread thread = new Thread(myRunnable);

		     // Start the thread
		     thread.start();
		 }
		}

