import java.util.*;

public class evenOddSum{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		
		//error 1 made here
		List<Integer> numbers= new ArrayList<>();
		
		
		for(int i=0;i<n;i++)
		{
		  System.out.println("Enter numbers["+i+"]");
		  //error 2 here
		  int num=sc.nextInt();
		  numbers.add(num);
		  
		}
		
		int sumEven=0, sumOdd=0;
		
		for(int x:numbers)
		{
			if(x%2==0)
			{
				sumEven+=x;
			}
			else{
				sumOdd+=x;
			}
		}
		
		System.out.println("Sum of Even numbers is"+ sumEven);
		System.out.println("Sum of Odd numbers is"+ sumOdd);
		
		sc.close();
	}
}
		
		