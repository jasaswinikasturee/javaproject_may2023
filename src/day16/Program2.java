package day16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Program2 {

	public static void main(String[] args) {
		List<Integer> x= new LinkedList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(30);
		x.add(40);
		System.out.println(x);
		
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(20));
		System.out.println(x.indexOf(30));
		System.out.println(x.indexOf(40));
		System.out.println(x.indexOf(60));
		
		
		System.out.println(x.lastIndexOf(40));
		System.out.println(x.lastIndexOf(60));
		
		x.set(3, 60);
		System.out.println(x);
		
		x.add(3,40);
		System.out.println(x);
		
		System.out.println(x.get(3));
		
		
		LinkedList<Integer> y= new LinkedList<Integer>();
		
		System.out.println(y.offer(40));
		
		System.out.println(y.offerFirst(140));
		System.out.println(y);
		System.out.println(y.offerLast(160));
		System.out.println(y);
		//140,40,160
		
	}

}
