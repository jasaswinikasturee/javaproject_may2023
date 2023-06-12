package day19;

import java.util.Hashtable;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> x= new Hashtable<>();
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
