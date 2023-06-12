package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> x= new HashMap<>();
		x.put(101, "aaa");
		x.put(102, "bbb");
		x.put(103, "ccc");
		
		System.out.println(x);
		
		x.remove(101);
		System.out.println(x);
		x.remove(105);
		System.out.println(x);
		
		x.remove(102, "bbb");
		System.out.println(x);
		
		x.remove(103, "abc");
		System.out.println(x);
		
		x.put(101, "aaa");
		x.put(102, "bbb");
		
		System.out.println(x);
		
		x.replace(101, "abc");
		System.out.println(x);
	
		x.replace(105, "aabbccc");
		System.out.println(x);
	
		x.replace(101, "abc", "ABCDE");
		System.out.println(x);
	
		
		for(Integer id:x.keySet())
		{
			System.out.println(id);
		}
		
		for(String value:x.values())
		{
			System.out.println(value);
		}
	
		for(Map.Entry<Integer, String> entry:x.entrySet())
		{
			System.out.println(entry);
		}
		
		for(Map.Entry<Integer, String> entry:x.entrySet())
		{
			System.out.println(entry.getValue());
		}
		
		for(Map.Entry<Integer, String> entry:x.entrySet())
		{
			System.out.println(entry.getKey());
		}
		
		
	}

}
