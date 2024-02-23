import java.util.*;

public class quickSort{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no. of ele ");
	
	int n= sc.nextInt();
	int[] arr= new int[n];
	
	System.out.println("Enter ele ");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Orginal Array");
	printArr(arr);
	
	quickSortOnArr(arr,0,n-1);
	
	System.out.println("Sorted Array");
	printArr(arr);
	
	sc.close();
	}
	
	public static void quickSortOnArr(int[] arr, int low ,int high)
	{
		if(low<high)
		{
			int pi= partition(arr,low,high);
			quickSortOnArr(arr,low,pi-1);
			quickSortOnArr(arr,pi+1,high);
		}
	}
	
	public static int partition(int[] arr,int low, int high)
	{
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
		
	}
	
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void printArr(int[] arr)
	{
		for(int num: arr)
		{
			System.out.println(num+" ");
		}
		System.out.println();
	}
}
		
	
	
	
	