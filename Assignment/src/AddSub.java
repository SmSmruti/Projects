interface AdditionSubstraction{
	int a = 30;
	int b = 10;
	void add();
	void sub();
	
}
public class AddSub implements AdditionSubstraction {
	 
	public void add() {
		System.out.println("Addition value is :"+(a+b));
	}
	public void sub() {
		System.out.println("Substraction value is :"+(a-b));
	}

 

	public static void main(String[] args) {
		AddSub obj = new AddSub();
		obj.add();
		obj.sub();



	}

}
