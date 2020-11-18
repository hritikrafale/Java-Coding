import java.util.*;

class Solution3{
	
	private int size , max;
	
	private int []arr = new int[size]; 
	
	Solution3(int size , int arr[]){
		this.size = size;
		this.arr = arr;
	}
	
	public void kadaneAlgo() {
		int i, max_so_far=0, max_ending_here=0;
		
		for(i=0;i<size;i++) {
			max_ending_here += arr[i];
			
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			
			if(max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		
		max = max_so_far;
	}
	
	public int getMax() {
		return max;
	}
}

public class KadaneAlgo {
	public static void main(String args[]) {
		int size , i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		
		size = s.nextInt();
		
		int []arr = new int[size];
		
		for(i=0 ; i< size ; i++) {
			arr[i] = s.nextInt();
		}
		
		Solution3 sol = new Solution3(size, arr);
		
		sol.kadaneAlgo();
		
		System.out.println("Max contiguous segment sum : "+sol.getMax());
	}
}
