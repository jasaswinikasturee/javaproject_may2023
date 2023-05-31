package day13;

public class Program2 {

	public static void main(String[] args) {
		int x=12;
		boolean flag=true;
		int a=2;
		while(a<x)
		{
			if(x%a==0)
			{
				flag=false;
				break;
			}
			a=a+1;
		}
 if(flag)
 {
	 System.out.println(x+" is a prime number");
 }
 else
 {
	 System.out.println(x+" is not a prime number");
 }
	}

}
