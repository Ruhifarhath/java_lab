import java.util.*;

abstract class shape
{
	abstract public void Area();
}
class Rectangle extends shape
{
	int l,b;
	Rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
	
	public void Area()
	{
		System.out.println("The area of Rectangle is: "+l*b);
	}
}

class Triangle extends shape
{
	int b,h;
	
	Triangle(int b, int h)
	{
		this.b=b;
		this.h=h;
	}
	public void Area()
	{
		System.out.println("The area of Triangle is: "+0.5*b*h);
	}
}

class Square extends shape
{
	int a;
	
	Square(int a)
	{
		this.a=a;
	}
	
	public void Area()
	{
		System.out.println("The area of Square is: "+a*a);
	}
}

public class abstractClass{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter l of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter b of rectangle");
		int breadth=sc.nextInt();
		Rectangle r= new Rectangle(length,breadth);
		r.Area();
		System.out.println();
		System.out.println("Enter b of triangle");
		int base=sc.nextInt();
		System.out.println("Enter h of triangle");
		int height=sc.nextInt();
		Triangle t= new Triangle(base,height);
		t.Area();
		System.out.println();
		System.out.println("Enter a of Square");
		int side=sc.nextInt();
		Square s= new Square(side);
		s.Area();
		System.out.println();
		
		sc.close();
	}
}
		
		
		