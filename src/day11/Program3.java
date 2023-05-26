package day11;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		int a=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the table value :");
		int table=scan.nextInt();
		scan.close();
		while(a<=10)
		{
			
			System.out.println(a+"x"+table+"="+a*table);
			a=a+1;
		}

	}

}
