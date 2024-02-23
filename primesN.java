import java.util.*;

public class primesN{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter n value");
		int n= sc.nextInt();
		
		//to print prime no.s upto n
		System.out.println("Prime numbers upto n are:");
		for(int i=2;i<n;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
		
		sc.close();
	}
	
	private static boolean isPrime(int num)
	{
		if(num<=1) return false;
		
		for(int j=2;j<=Math.sqrt(num);j++)
		{
			if(num%j==0) return false;
		}
		return true;
	}
}
			  
			
		
		