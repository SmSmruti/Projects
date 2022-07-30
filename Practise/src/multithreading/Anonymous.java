package multithreading;

interface Calculation {
	int add(int a, int b);

	int sub(int a, int b);
}

class CalculationClass implements Calculation {

	  @Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}
}

public class Anonymous {

	public static void main(String[] args) {

		CalculationClass cc = new CalculationClass() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}

			@Override
			public int sub(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Addition of (20+30) = " + cc.add(20, 30));
		System.out.println("Substraction of (50-35) = " + cc.sub(50, 35));
	}
}
