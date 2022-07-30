import java.util.Scanner;

public class AreaAndVolume {
	private static Scanner scan;
	

	public static void main(String[] args) {
		double Radius, Area, Height, Volume;
		scan = new Scanner(System.in);
		
		System.out.println("\n Please Enter the Radius of a Cylinder : ");
		Radius = scan.nextDouble();
		System.out.println("\n Please Enter the Height2 of Cylinder");
		Height = scan.nextDouble();
		
		Area = 2 * 3.141 * Radius *(Radius + Height);
		Volume = 3.141 * Radius * Radius * Height;
		
		System.out.format("\n The Surface area of a Cylinder = %f" , Area);
		System.out.format("\n The Volume of a Cylinder = %f" , Volume);
		
		
		

	}

}
