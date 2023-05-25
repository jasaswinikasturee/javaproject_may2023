package day10;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=10;
		int c=400;
		
		if(a>=b && a>=c)
		{
		
		if(a==b && a==c)
		{
			System.out.println("a,b & c are equal");
		}
		else if(a>=b && b>c)
		{
			if(a==b)
			{System.out.println("a and b are equal and c is less than a and b");
		}
			else
			{
				System.out.println("a is greater than b and b is greater than c");
			}
		}
		else if(a>=c && c>b)
		{
			if(a==c)
			{System.out.println("a and c are equal and b is less than a and c");
		}
			else
			{
				System.out.println("a is greater than c and c is greater than b");
			}
		}
			else
			{
				System.out.println("a is greater than b and c & b and c are equal");
			}
		}
		else if(b>=a &&b>=c)
		{
			if(b>a && a>=c)
			{
				if(a==c)
				{
					System.out.println("b is greater than a and a is greater than c");
				}
			}
			else if(b>=c && c>a)
			{
				if(b==c)
				{
					System.out.println("b and c are equal and greater than a");
				}

				else
				{
					System.out.println("b is greater than c and c is greater than a");
				}
			}
		}
		else
		{
			if(c>a && a>=b)
			{
				if(a==b)
				{
					System.out.println("c is greater than a & b and a & b  are equal");
				}
				else
				{
					System.out.println("c is greater than a & a is greater than b");
				}
			}
				else
				{
					System.out.println("c is greater than b and b is greater than a");
				}
			}
			}

			
				
		}
		
