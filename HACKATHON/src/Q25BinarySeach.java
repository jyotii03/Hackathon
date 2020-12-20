import java.util.Scanner;

public class Q25BinarySeach {

	public static void main(String[] args) {
		
		
				Scanner sc=new Scanner(System.in);
				int[]arr=new int[5];
				for(int i=0;i<5;i++) {
					System.out.println("Enter number in array ");
					arr[i]=sc.nextInt();
				}
				System.out.println("enter number to find in array");
				int num=sc.nextInt();
				int len=arr.length;
				int pos=binarySearch(arr,1,len-1,num);
				if (pos == -1) 
		            System.out.println("Element not present"); 
		        else
		            System.out.println("Element found at index " + pos); 

			}
			static int binarySearch(int arr[], int l, int r, int x) 
		    { 
		        if (r >= l) { 
		            int mid = l + (r - l) / 2;
		            if (arr[mid] == x) 
		                return mid; 
		  
		           
		            if (arr[mid] > x) 
		                return binarySearch(arr, l, mid - 1, x); 
		  
		            return binarySearch(arr, mid + 1, r, x); 
		        } 
		  
		       
		        return -1; 
		    } 
	}


