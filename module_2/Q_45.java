//W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
//Daemon () method of Thread class and check whether the thread is set daemon or
//not by using is Daemon () method.
//TestDaemonThread2 t1=new TestDaemonThread2();
////TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
//t1.setDaemon(true);//will throw exception here t2.start();

package module_2;

class TestDaemonThread2 extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class Q_45 {

	    public static void main(String[] args) {
	        // Create two thread instances
	        TestDaemonThread2 t1 = new TestDaemonThread2();
	        TestDaemonThread2 t2 = new TestDaemonThread2();

	        // Start the first thread
	        t1.start();

	        // Check if t1 is a daemon thread
	        System.out.println("Is t1 a daemon thread? " + t1.isDaemon());

	        try {
	            // Attempt to set the first thread as daemon (will throw an exception)
	            t1.setDaemon(true);
	        } catch (IllegalThreadStateException e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        }

	        // Start the second thread
	        t2.start();

	        // Check if t2 is a daemon thread
	        System.out.println("Is t2 a daemon thread? " + t2.isDaemon());
	    }
	}


