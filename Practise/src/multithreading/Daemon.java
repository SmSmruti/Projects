package multithreading;

class x extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Deamon Thread : " + Thread.currentThread().getName());
		} else {
			System.out.println("User Thread : " + Thread.currentThread().getName());
		}
	}
}

public class Daemon {

	public static void main(String[] args) {

		x t1 = new x();
		x t2 = new x();
		x t3 = new x();

		t3.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();

	}

}
