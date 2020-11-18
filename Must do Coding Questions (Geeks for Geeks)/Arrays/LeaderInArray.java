import java.util.*;


public class LeaderInArray {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int size;
		
		System.out.print("\nEnter the size of the array : ");
		size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("\nEnter the elements in the array : ");
		for(int i=0;i<size;i++)
			arr[i] = s.nextInt();
		
		getLeader(size, arr);
		
		//System.out.print("\nEquilibrium point is : "+getLeader(size , arr));
	}
	
	static void getLeader(int size , int arr[]) {
		int leader = -1 , i , max=arr[size-1];
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
//		System.out.print(arr[size-1]+" ");
		a.add(0,arr[size-1]);
		
		for(i=size-2 ; i!=-1 ;i--) {
			if(arr[i] >= max) {
				a.add(0,arr[i]);
				max=arr[i];
			}
		}
		
		System.out.print(a);
	}
	
}
