import java.util.*;

public class sortNames{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter no.of names");
		int n=sc.nextInt();
		sc.nextLine(); //consumes new line char of nextInt
		
		List<String> names= new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter names["+i+"]");
			String name=sc.nextLine();
			names.add(name);
		}
		
		// names sort in ascending order
		Collections.sort(names);
		System.out.println("Names Sorted in ascending order");
		for(String name: names)
		{
			System.out.println(name);
		}
		
		// names sort in decending order
		Collections.sort(names,Collections.reverseOrder());
		System.out.println("Names Sorted in decending order");
		for(String name: names)
		{
			System.out.println(name);
		}
		sc.close();
	}
}
			
		