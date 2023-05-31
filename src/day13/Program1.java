package day13;

public class Program1 {

	public static void main(String[] args) {
	
		
		int x=0;
		int y=1;
		int z;
		
		int a=1;
		while(a<=10) 
		{
			System.out.print(x+","); 
			z=x+y; //new number 
			x=y; 
			y=z; 
			a=a+1;
		}
		
		System.out.println("\n For loop");
		x=0;
		y=1;
		for(int i=0; i<10;i++)
		{
			System.out.print(x+",");
			z=x+y;
			x=y;
			y=z;
		}
		
		System.out.println("\n Do-while");
		x=0;
		y=1;
		int b=0;
		do {
		   b++;
			System.out.print(x+",");
			z=x+y;
			x=y;
			y=z;
		}while(b<=10);
		
	}

}
