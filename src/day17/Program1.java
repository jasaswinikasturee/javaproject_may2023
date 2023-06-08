package day17;

import java.util.Arrays;
import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> y=new LinkedList<Integer>();
		Integer[] x= {10,20,30,40,50,60};
		y.addAll(Arrays.asList(x));
		
		System.out.println(y);
		
		System.out.println(y.getFirst());
		
		System.out.println(y.getLast());
		
		y.addAll(2, Arrays.asList(x));
		
		System.out.println(y);
		
		System.out.println(y.peek());
		System.out.println(y);
		System.out.println(y.peekFirst());
		System.out.println(y.peekLast());
		
		
		System.out.println(y.poll());
		System.out.println(y);
		
		System.out.println(y.pollFirst());
		System.out.println(y);
		
		System.out.println(y.pollLast());
		System.out.println(y);
		
		System.out.println(y.poll());
		System.out.println(y);
		
		
		
		

	}

}
