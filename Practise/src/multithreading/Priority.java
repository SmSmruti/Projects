package multithreading;

class PriorityDemo extends Thread {
	public synchronized void run() {
		System.out.println("Priority Given To - " + currentThread());
	}
}

public class Priority {

	public static void main(String[] args) {
		
		PriorityDemo p1 = new PriorityDemo();
		PriorityDemo p2 = new PriorityDemo();
		PriorityDemo p3 = new PriorityDemo();
		
		p1.setPriority(7);
		p2.setPriority(5);
		p3.setPriority(3);
		
		p1.start();
		p2.start();
		p3.start();
	}

}
