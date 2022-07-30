
public class Arrayex {

	public static void main(String[] args) {
		int []arr= {3,6,2,8,9};
		int n=arr.length;
		System.out.print("the string is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int temp=0;
		for(int i=0;i<n;i++) { 
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				}
			}
			System.out.println();
		}
System.out.print("the Ascending string is : ");
for(int j=0;j<n;j++) {
	System.out.print(arr[j]+" ");
}
	}

}
