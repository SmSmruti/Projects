package multithreading;

interface Cal{
	void add();
}

public class Interface {
	public static void main(String[] args) {
		Cal c = () -> System.out.println("Addition");
		c.add();
	}

}
