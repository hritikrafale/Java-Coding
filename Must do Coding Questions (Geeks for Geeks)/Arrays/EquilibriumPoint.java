import java.util.*;

public class EquilibriumPoint {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int size;
		
		System.out.print("\nEnter the size of the array : ");
		size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("\nEnter the elements in the array : ");
		for(int i=0;i<size;i++)
			arr[i] = s.nextInt();
		
		System.out.print("\nEquilibrium point is : "+getEquiPoint(size , arr));
		
		
	}
	
	static int getEquiPoint(int size , int arr[]) {
		int point = -1 , sumr=0 , suml=0 , i;
		
		for(i=0 ; i<size ; i++) {
			suml+=arr[i];
		}
		
		for(i=size-1 ; i!=-1 ; i--) {
			suml-=arr[i];
			
			if(suml == sumr) {
				point=i+1;
				break;
			}
			
			sumr+=arr[i];
			
		}
		
		return point;
	}
}
