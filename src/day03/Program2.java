package day03;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add (101234,20);
		mul(10,20);
		div(1000,20);
		sub(100,200);
		add(10,2000);

	}

	private static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	protected static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	 static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void div(int a, int b)
	{
		System.out.println(a/b);
	}
}
