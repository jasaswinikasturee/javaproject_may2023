package day15;
import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		
		String[] a= { "aa", "bbb", "cccc", "ddddd"};
		
		System.out.println("Indexing--------");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("Value-------");
		
		for(String b:a)
		{
			System.out.println(b);
		}
		System.out.println("Index------");
		int[] x= {10,30,20,50,40,60};
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
			System.out.println("Value-------");
			for(int y:x)
			{
				System.out.println(y);
			}
		}
	}


