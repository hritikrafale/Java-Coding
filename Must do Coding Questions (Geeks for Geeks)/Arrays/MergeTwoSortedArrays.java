import java.util.*;

public class MergeTwoSortedArrays {
	
	public static int[] mergeArrays(int size1 , int size2 , int arr1[] , int arr2[]) {
		int arr3[] = new int[size1+size2];
		
		int i=0,j=0,k=0;
		
		while(i<size1 && j<size2) {
			if(arr1[i] > arr2[j]){
				arr3[k] = arr2[j];
				j++;
			} else {
				arr3[k] = arr1[i];
				i++;
			}
			k++;
		}
		
		while(i < size1) {
			arr3[k++] = arr1[i++];
		}
		
		while(j < size2) {
			arr3[k++] = arr2[j++];
		}
		
		return arr3;
	}
	
	public static void main(String args[]) {
		int size1,size2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\nEnter size of first array : ");
		size1 = s.nextInt();
		
		int []arr1 = new int[size1];
		
		System.out.print("\nEnter the elements in array 1 : ");
		for(int i=0 ; i<size1 ; i++) {
			arr1[i]=s.nextInt();
		}
		
		System.out.print("\nEnter size of second array : ");
		size2 = s.nextInt();
		
		int []arr2 = new int[size2];
		
		System.out.print("\nEnter the elements in array 2 : ");
		for(int i=0 ; i<size2 ; i++) {
			arr2[i]=s.nextInt();
		}
		
		int []arr3 = new int[size1+size2];
		
		arr3 = mergeArrays(size1 , size2 , arr1 , arr2);
		
		System.out.print("\nMerged array is : ");
		for(int i=0 ; i<size1 + size2 ; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
