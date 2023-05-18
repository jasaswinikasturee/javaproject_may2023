package day05;
//super class //parent class
public class Program5 {
	
	static int x=10;
	static int y=20;

	public static void main(String[] args) {
		
 
		Program6.xyz(10,20);
	}

	
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	private static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	protected static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	static void div(int a, int b)
	{
		System.out.println(a/b);
	}

	
}
