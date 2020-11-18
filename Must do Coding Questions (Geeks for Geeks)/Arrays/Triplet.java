import java.util.Scanner;

class Solution2{
	
	private int size,result;
	
	private int []arr = new int[size];
	
	Solution2(int size , int arr[]){
		this.size = size;
		this.arr = arr;
	}
	
	public void bruteForce() {
		int i,j,k,count=0;
		
		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				for(k=j+1;k<size;k++) {
					if(arr[i]+arr[j] == arr[k]) {
						count++;
					}
				}
			}
		}
		result=count;
	}
	
	public void better() {
		int i,j,max=0,count=0;
		
		for(i=0;i<size;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		int []memory = new int[max+1];
		
		for(i=0;i<max+1;i++) {
			memory[i]=0;
		}
		
		for(i=0;i<size;i++) {
			memory[arr[i]]++;
		}
		
		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				int temp=arr[i]+arr[j];
				if(max>=temp && memory[temp]>0) {
					count+=memory[temp];
				}
			}
		}
		
		result = count;
	}
	
	public void best() {
		int  i,j, count=0,max=0;
		
		for(i=0;i<size;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		
		int []memory = new int[max+1];
		
		for(i=0;i<=max;i++){
			memory[i]=0;
		}
		
		for(i=0;i<size;i++){
			memory[arr[i]]++;
		}
		
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++)
			{
				int temp= arr[i]+arr[j];
				if(temp < max+1 &&  memory[temp]>0){
					count+=memory[temp];
				}
			}
		}
		
		
		result = count;
	}
	
	public int getResult() {
		return result;
	}
}


public class Triplet {
	public static void main(String args[]) {
		
		int size , i ,result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		
		size = s.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Enter the array:");
		for(i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		
		Solution2 sol = new Solution2( size , arr);
		
		sol.best();
		
		result = sol.getResult();
		
		System.out.println("\nCount : "+result);
		
	}
}
