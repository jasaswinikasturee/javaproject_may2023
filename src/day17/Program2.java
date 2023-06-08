package day17;

import java.util.Arrays;
import java.util.LinkedList;


public class Program2 {

	public static void main(String[] args) {

		LinkedList<Integer> y=new LinkedList<Integer>();
		Integer[] x= {10,20,30,40,50,60};
		y.addAll(Arrays.asList(x));
		
		System.out.println(y);
		y.push(80);
		System.out.println(y);

		y.removeFirst();
		System.out.println(y);
		y.removeLast();
		System.out.println(y);
        y.add(10);
		y.add(50);
		y.add(20);
		y.add(50);
		System.out.println(y);
		
		y.removeFirstOccurrence(50);
		
		System.out.println(y);
		
		y.removeLastOccurrence(20);
		System.out.println(y);
		
		y.addFirst(20);
		System.out.println(y);
		
		y.addLast(60);
		System.out.println(y);
		
		
		
	}

}
