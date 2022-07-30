package multithreading;

class ThreadDemo extends Thread {
	public void run() {
		System.out.println("MultiThreading");
	}

	public static void main(String[] Args) {
		ThreadDemo m = new ThreadDemo();
		m.start();

	}
}
