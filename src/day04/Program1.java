package day04;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program1 abc = new Program1();
		int x = add(20, 40) ;
		System.out.println(x*x);
		System.out.println(x*x*x);
		byte u=50;
		byte v=30;
		abc.sub((byte) 50, (byte)30);
		abc.sub(u,v);
		


	}

	
	public static int add(int a, int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	
	
	public int sub(byte a, byte b)
	{
		return a-b;
	}
}
