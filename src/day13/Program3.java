package day13;

public class Program3 {

	public static void main(String[] args) {
		int x=111;
		boolean flag=true;
		for(int a=2;a<x;a=a+1)
		{
			if(x%a==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(x+"is a prime number");
		}
		else
		{
			System.out.println(x+"is not a prime number");
		}
	}

}
