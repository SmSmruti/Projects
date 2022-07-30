package multithreading;

//BY EXTENDING THREAD CLASS.....

class A extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Batulla Raju");
				Thread.sleep(1000);
			}
		} catch (Exception e) {

		}

	}
}

class ThreadDemo4 {
	public static void main(String[] Args) throws Exception {
		A t = new A();
		t.start();

		for (int i = 1; i <= 5; i++) {

			System.out.println("Satya Narayan");
			Thread.sleep(1000);
		}
	}
}