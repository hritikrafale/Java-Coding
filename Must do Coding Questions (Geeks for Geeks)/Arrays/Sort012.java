import java.util.*;

public class Sort012 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int size;
		
		System.out.print("\nEnter the size of the array : ");
		size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("\nEnter the array elements : ");
		for(int i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		
		sort(size,arr);
		
		System.out.print("\nResult array is : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void sort(int size , int arr[]) {
		int i, count0=0 , count1=0, count2=0;
		
		for(i=0;i<size;i++) {
			if(arr[i] == 0) {
				count0++;
			} else if(arr[i] == 1) {
				count1++;
			} else {
				count2++;
			}
		}
		
		i=0;
		
		while(count0-- !=0)
			arr[i++] = 0;
		
		while(count1-- !=0)
			arr[i++] = 1;
		
		while(count2-- !=0)
			arr[i++] = 2;
		
	}
}
