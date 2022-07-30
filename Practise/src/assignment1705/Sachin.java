//Write ajava program to implementbubble sort on an arraylist of integer values.

package assignment1705;

import java.util.Arrays;

public class Sachin {
	public static void main(String[] Args) {

		int arr[] = { 3, 4, 1, 7, 2 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------");

		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-i-1;j++) {
				if(arr [i]< arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}
}
//wrongggggggggggggggggggggggggggggggggggggg