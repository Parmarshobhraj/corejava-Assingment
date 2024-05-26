//W.A.J.P to create 2 threads and execute that threads by providing sleep time as
//2000ms and check the execution.

package module_2;

class MyThread1 extends Thread {
    private String threadName;

    public MyThread1(String name) {
        this.threadName = name;
    }

    public void run() {
        try {
            System.out.println(threadName + " is running.");
            Thread.sleep(2000); // Sleep for 2000 milliseconds
            System.out.println(threadName + " has finished execution.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
    }
}


public class Q_43 {
	
	    public static void main(String[] args) {
	        // Create two thread instances
	        MyThread1 thread1 = new MyThread1("Thread 1");
	        MyThread1 thread2 = new MyThread1("Thread 2");

	        // Start both threads
	        thread1.start();
	        thread2.start();
	    }
	}

