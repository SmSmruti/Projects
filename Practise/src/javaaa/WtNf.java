package javaaa;

class WN extends WtNf {
	int t = 0;

	public void run() {
		try {
			synchronized (this) {
				for (int i = 0; i < 10; i++) {
					t = t + i;
					this.notify();
				}
			}
		}

		catch (Exception e) {
		}

	}

	public void start() {
		
	}
}

public class WtNf {

	public static void main(String[] args) throws InterruptedException {

		WN w = new WN();
		w.start();
		synchronized (w) {
			System.out.println("Main Thread");
			w.wait();
			System.out.println("Main Thread Got Notified");
			System.out.println(w.t);
		}

	}

}
