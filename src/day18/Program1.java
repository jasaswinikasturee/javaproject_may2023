package day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		
		Set<String> x= new HashSet<>();
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("AA");
		x.add("BB");
		x.add("CC");
		System.out.println(x);
				 
		String[] y= {"abc", "bcd", "cde"};
		x.addAll(Arrays.asList(y));
		
		System.out.println(x);
		
		System.out.println(x.size());
		
		for(String a:x)
		{
			System.out.println(a);
		}
		
		System.out.println(x.contains("aa"));
		System.out.println(x.contains("aaa"));
		
		System.out.println(x.containsAll(Arrays.asList(y)));
		
		System.out.println(x.isEmpty());
		
		x.remove("AA");
		System.out.println(x);
		
		x.remove("BBBB");
		System.out.println(x);
		
		x.clear();
		System.out.println(x);

		System.out.println(x.isEmpty());
		System.out.println(x);
	}

}
