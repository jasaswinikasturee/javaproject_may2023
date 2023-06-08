package day17;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;

public class Program3 {

	public static void main(String[] args) {
		Integer[] z= {10,20,30,40,60,10,20,70};
		
		List<Integer> x= new LinkedList<> ();
		x.addAll(Arrays.asList(z));
		System.out.println(x);
		
		Set<Integer> y=new HashSet<Integer>();
		y.addAll(Arrays.asList(z));
		System.out.println(y);
		
	
		Set<Integer> y1=new TreeSet<Integer>();
		y1.addAll(Arrays.asList(z));
		System.out.println(y1);
		
		Set<Integer> a= new HashSet<Integer>();
		a.addAll(Arrays.asList(z));
		System.out.println(a);
	}

}
