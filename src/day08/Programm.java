package day08;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=30;
		int c=10;
		
		// + - * / %
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/3);
		System.out.println(a%3);
		
		//> < >= <= == !=
		System.out.println(a<b); //true false
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("LOGICAL");  //&&- ||-or !-not
		
		boolean x=true;
		boolean y=false;
		boolean z= true;
		
		System.out.println(!x);
		System.out.println(!y);
		System.out.println(x&&y);//true
		System.out.println(x&&z);//false
		
		System.out.println(x||z); //true
		System.out.println(x||y);//true
		
		
		
	}

}
