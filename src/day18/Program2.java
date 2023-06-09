package day18;

import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		
		Set<Integer> x= new HashSet<>();
		Set<Integer> y= new HashSet<>();
		
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		
		y.add(3);
		y.add(4);
		y.add(5);
		y.add(6);
		
		System.out.println(x);
		System.out.println(y);
		
		Set<Integer> xUniony= new HashSet<>(x);
		xUniony.addAll(y);
		System.out.println(xUniony);
		
		Set<Integer> xIntersectiony= new HashSet<>(x);
		xIntersectiony.retainAll(y);
		System.out.println(xIntersectiony);
		
		Set<Integer> xDiffy= new HashSet<>(x);
		xDiffy.removeAll(y);
		System.out.println(xDiffy);
		
		
		Set<Integer> yDiffx= new HashSet<>(y);
		yDiffx.removeAll(x);
		System.out.println(yDiffx);


		
	
		
	}

}
