package day13;

public class Program4 {

	public static void main(String[] args) {
		for(int x=50;x<=100;x=x+1)
		{
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
				System.out.println(x);
			}
		}

	}

}
