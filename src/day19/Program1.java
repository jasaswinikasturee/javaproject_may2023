package day19;

import java.util.HashMap;

public class Program1 {

	public static void main(String[] args) {
		HashMap<Integer, String> x= new HashMap<>();
		x.put(101, "aaa");
		x.put(102, "bbb");
		x.put(103, "ccc");
		
		System.out.println(x);

		x.put(101, "ccc");
		System.out.println(x);
		
		System.out.println(x.keySet());
		
		System.out.println(x.values());
		
		System.out.println(x.entrySet());
		
		System.out.println(x.size());
		
		System.out.println(x.containsKey(101));
		
		System.out.println(x.containsKey(105));
		
		System.out.println(x.containsValue("ccc"));
		System.out.println(x.containsValue("aaa"));
		
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
	}

}
