package day01;

public class proGram1 {  
	static int u=30;
	int v=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		proGram1 xyz= new proGram1();
		xyz.add(101234,20);
		mul(u,xyz.v);
		div(1000,20);
		xyz.sub(100,200);
		xyz.add(10,2000);
		}

	private void add(long a, int b)
	{
		System.out.println(a+b);
	}
	protected void sub(int a, int b)
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
