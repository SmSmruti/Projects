abstract class Animal {
	abstract void sound();
}
	class Dog extends Animal{
		public void sound() {
			System.out.println("Dog is Barking");
		}
		
	}
	class Lion extends Animal{
		public void sound() {
			System.out.println("Lion is Roaring");
		}
	}

public class AbstractClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		Lion l = new Lion();
		d.sound();
		l.sound();
		
		

	}

}