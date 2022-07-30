package javaaa;

class Running implements Runnable {

	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("Child Thread");
		}

	}

}

public class RunnableInterface {

	public static void main(String[] args) {
		Running r = new Running();
		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 4; i++) {
			System.out.println("Main Thread");
		}

	}

}
