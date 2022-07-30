package javaaa;

interface Calcu{
	void add();
}

public class LambdaDemo {

	public static void main(String[] args) {
		Calcu c= () -> {
			System.out.println("Add Method");
		};
		
		c.add();

	}

}
