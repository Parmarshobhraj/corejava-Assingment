//W.A.J. P to create one thread by extending Thread class in another Class.

package module_2;

//Class extending the Thread class
class MyThread extends Thread {
 // run method of the Thread class
 public void run() {
     // Task to be performed by the thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread is running: " + i);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted.");
         }
     }
 }
}



public class Q_42 {

		 public static void main(String[] args) {
	
		     MyThread myThread = new MyThread();
		     
		     myThread.start();
		 }
		}

