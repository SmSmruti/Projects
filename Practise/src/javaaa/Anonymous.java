package javaaa;

interface Cal {
	void add();

	void sub();

}

public class Anonymous {

	public static void main(String[] args) {
		
		Cal c = new Cal() {          //override the interface class metho;
		public void add() {		
			System.out.println("Addition");
		}
		public void sub() {
			System.out.println("Substraction");
		}
		};
		
		c.add();
		c.sub();

	}

}
