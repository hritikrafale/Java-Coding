import java.util.*;

class Solution4{
	private int size , missingNumber;
	
	private int []arr = new int[size];
	
	Solution4(int size , int arr[]){
		this.size = size;
		this.arr = arr;
	}
	
	public void method1() {
		int sum = (size/2)*(2+(size-1));
		
		int sumArr=0;
		
		for(int i=0 ; i<size-1 ; i++) {
			sumArr+=arr[i];
		}
		
		missingNumber = sum-sumArr;
	}
	
	public void method2() {
		int x1=0 , x2=0;
		
		for(int i=0 ; i<size-1; i++) {
			x1 = x1 ^ arr[i];
		}
		 
		for(int i=1 ; i<=size ; i++) {
			x2 = x2 ^ i;
		}
		
		missingNumber = x1 ^ x2;
	}
	
	public int getMissingNumber() {
		return missingNumber;
	}
	
}

public class MissingNumberInArray {
	public static void main(String args[]) {
		//scanner class
		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.print("\nEnter the size of the array : ");
		n = s.nextInt();
		
		int []arr = new int[n-1];
		
		System.out.print("\nEnter the values in the array : ");
		for(int i=0 ; i<n-1 ; i++) {
			arr[i]=s.nextInt();
		}
		
		Solution4 sol = new Solution4(n , arr);
		
		sol.method2();
		
		System.out.print("\nMissing number is : "+sol.getMissingNumber());
		
	}
	
	
}
