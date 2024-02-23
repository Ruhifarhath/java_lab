import java.util.*;


public class binarySearch{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		
		List<Integer>nums=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter num["+i+"]");
			int num=sc.nextInt();
			nums.add(num);
		}
		
		System.out.println("Enter target");
		int target=sc.nextInt();
		int index=binarySearchOnArray(nums,target,0,n-1);
		if(index!=-1)
		{
			System.out.println(target+"found at index "+index);
		}
		else
		{
			System.out.println(target+" not found ");
		}
			
		sc.close();
	}
	
	private static int binarySearchOnArray(List<Integer> nums,int target,int low, int high)
	{
		if(low>high) return -1;
		
		int mid=low+(high-low)/2;
		
		if(nums.get(mid)==target) return mid;
		
		else if(nums.get(mid)<target)
		{
			return binarySearchOnArray(nums,target,mid+1,high);
		}
		else
		{
			return binarySearchOnArray(nums,target,low,mid-1);
		}
	}
}