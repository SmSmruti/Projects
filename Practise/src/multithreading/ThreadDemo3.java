package multithreading;

//BY EXTENDING THREAD CLASS....

class z extends Thread {
	public void run() {
		for (int i = 1; i <6; i++) {

			System.out.println("DOG");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

class ThreadDemo3 {
	public static void main(String[] args) throws Exception {
		z t = new z();
		t.start();
		for (int i = 1; i <6; i++) {
			System.out.println("CAT");
			Thread.sleep(1000);
		}
	}
}