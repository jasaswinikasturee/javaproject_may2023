package day12;

public class Program4 {

	public static void main(String[] args) {
		//for loop
		int result=1;
		int n=10;
		for(int a=1;a<=n;a=a+1)
		{
			result = result*a;
		}
         System.out.println(result);
		
         //while loop
         int b=1;
         result=1;
         while(b<=n)
         {
        	 result = result*b;
        	 b=b+1;
         }
         System.out.println(result);
         
         //do-while loop
         int c=1;
         result=1;
         do {
        	 result = result*c;
        	 c=c+1;
         }while(c<=n);
         System.out.println(result);
	}

}
