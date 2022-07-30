abstract class Animals{
	abstract void sound();
	}
		
		class Dog extends Animals {
			public void sound() {
				System.out.println("Dog is Barking");
			}
		 
		}
	    class Lion extends Animals{
		    public void sound() {
			System.out.println("Lion is Roaring");
			
		}
	
}
public class Mamals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
    	Lion l = new Lion();
		d.sound();
		l.sound();
	}

}
