import java.util.*;

public class RearrangeArray {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int size;
		
		System.out.print("\nEnter the size of the array :");
		size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("\nEnter the array elements : ");
		for(int i=0 ; i<size ; i++) {
			arr[i] = s.nextInt();
		}
		
		
		 rearrange(size , arr);
		
		System.out.print("\nRearranged array is : ");
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void rearrange(int size , int arr[]) {
		int i,j;
		
		for(i=0 ; i < size ; i+=2) {
			int temp = arr[size-1];
			for(j=size-2 ; j>= i ; j--) {
				arr[j+1]=arr[j];
			}
			arr[i]=temp;
		}
	}
}
