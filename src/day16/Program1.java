package day16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
	

		List<Integer> x= new LinkedList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(50);
		x.add(10);
		x.add(20);
		System.out.println(x);
		System.out.println(x.size());
		
		Integer[] y= {22,3,33,4,55,5};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		
		x.remove(4); //index
		System.out.println(x);
		
		x.removeAll(Arrays.asList(y));
		System.out.println(x);
		System.out.println(x.size());
		
		
		System.out.println(x.contains(20));
		System.out.println(x.contains(120));
		
		System.out.println(x.isEmpty());
		
		x.clear();
		
		System.out.println(x.isEmpty());
		
		System.out.println(x);
		
	}

}
