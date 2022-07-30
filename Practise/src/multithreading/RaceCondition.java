package multithreading;

class count extends Thread {

	private int n = 6;

	public void increment() {
		++n;
	}

	public void decrement() {
		--n;
	}

	public void getname() {
		System.out.println("The number is - " + n);
	}

	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread());
			increment();
			decrement();
			getname();
		}
	}
}

public class RaceCondition {

	public static void main(String[] args) {
		count c = new count();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		System.out.println(t1);
		System.out.println(t2);
		t1.start();
		t2.start();

	}

}
