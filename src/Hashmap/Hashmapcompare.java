package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashmapcompare {

	public static void main(String[] args) {
		HashMap<Integer,String>map1=new HashMap<Integer,String>();
		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");
		
		HashMap<Integer,String>map2=new HashMap<Integer,String>();
		map2.put(3,"C");
		map2.put(2,"B");
		map2.put(1,"A");
		
		
		HashMap<Integer,String>map3=new HashMap<Integer,String>();
		map3.put(4,"D");
		map3.put(1,"A");
		map3.put(2,"B");
		map3.put(3,"C");
		//on the basis of keya and value:use equals method
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		// camparing hashmaps for the same Keys:keySet();
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map2.keySet()));
		
		//find out the extra  keys
		HashSet<Integer>combineKeys=new HashSet<>(map1.keySet());
		
		//add the keyset fron map3
		combineKeys.addAll(map3.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);
		// compare  maps by value 
		
		HashMap<Integer,String>map5=new HashMap<Integer,String>();
		map5.put(1,"A");
		map5.put(2,"B");
		map5.put(3,"C");
		
		HashMap<Integer,String>map6=new HashMap<Integer,String>();
		map6.put(4,"A");
		map6.put(5,"B");
		map6.put(6,"C");
		
		
		HashMap<Integer,String>map7=new HashMap<Integer,String>();
		map7.put(1,"A");
		map7.put(2,"B");
		map7.put(3,"C");
		map7.put(4,"C");
		//1.duplicates are not allowed: by using ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
	 //duplicates are allowed: in Hash Set
	System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
	System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
	
	}

}
