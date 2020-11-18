import java.util.*;

class Solution{
	
	private int target , size;
	
	private int []arr = new int[size];
	
	private int []result = new int[]{0,0};
	
	
	Solution(int target , int size , int arr[]){
		this.target = target;
		this.size = size;
		this.arr = arr;
	}
	
	public void bruteForce() {
		int i, j, k, sum;
		
		for(i=0; i<size; i++) {
			for(j=0; j<size; j++) {
				sum=0;
				for(k=i; k<=j; k++) {
					sum+=arr[k];
				}
				if(sum == target) {
					result[0] = i;
					result[1] = j;
					return ;
				}
			}
		}
	}
	
	public void betterBruteForce() {
		int i,j,sum;
		
		for(i=0; i<size; i++) {
			sum=0;
			for(j=i;j<size;j++) {
				sum+=arr[j];
				
				if(sum == target) {
					result[0] = i;
					result[1] = j;
					return;
				}
			}
		}
	}
	
	public void best() {
		int low=-1,  high=-1 , sum=0;
		
		while(high<size) {
			if(sum<target) {
				high++;
				sum+=arr[high];
			} else if(sum>target) {
				low++;
				sum-=arr[low];
			} else {
				result[0] = low+1;
				result[1] = high;
				return;
			}
		}
	}
	
	public int[] getResult() {
		return result;
	}
	
}


public class TargetSum {
	public static void main(String args[]) {
		int size , target , i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		
		size = s.nextInt();
		
		System.out.println("Enter the target sum:");
		
		target = s.nextInt();
		
		int []arr = new int[size];
		int []result = new int[2];
		
		System.out.println("Enter the array:");
		for(i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		
		Solution sol = new Solution(target , size , arr);
		
		sol.best();
		
		result = sol.getResult();
		
		System.out.println("\nStarting Index : "+result[0]+"\nEnding Index : "+result[1]);
		
	}
}
