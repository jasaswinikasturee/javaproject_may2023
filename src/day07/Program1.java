package day07;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		main();
		main("Good Morning...");
		System.out.println(main(10,30));
		
	}

	public static void main(String message)
	{
		System.out.println(message);
	}
	public static void main()
	{
		System.out.println("Main overloading method");
	}
	
	public static int main(int a, int b)
	{
		return a+b;
	}
}
