class Add{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
}	 

public class Overloading {

	public static void main(String[] args) {
		Add A = new Add();
	     System.out.println(A.add(5.6, 2.3));
		

	}

}
