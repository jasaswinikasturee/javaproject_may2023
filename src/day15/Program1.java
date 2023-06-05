package day15;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		

		int x[] = new int[5];
		x[0]=101;
		x[3]=45;
		x[4]=6;
		System.out.println(x[4]);
		System.out.println(x[1]);//0
		System.out.println(x[2]);//0
		//System.out.println(x[11]);
		//x[5]=16;
		//System.out.println(x[6]);
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int[] y =Arrays.copyOf(x, 10);
		System.out.println(Arrays.toString(y));
		System.out.println(x.length);
		System.out.println(y.length);
		int z[]=Arrays.copyOf(x, x.length);
		System.out.println(Arrays.toString(z));
		String[] a= {"aa", "bbb", "cccc", "dddd"};
		System.out.println(Arrays.toString(a));
		a[2]="abc";
		System.out.println(Arrays.toString(a));
		
	}

}
