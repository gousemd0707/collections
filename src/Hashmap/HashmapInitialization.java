package Hashmap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapInitialization {
	
	public static Map<String,Integer>markesmap;
	static {
		markesmap=new HashMap<>();
		markesmap.put("A",100);
		markesmap.put("B",200);
		
	}

	public static void main(String[] args) {
	//1.using HashMap
		HashMap<String,String>map1=new HashMap<>();
		Map<String,String>map2=new HashMap<>();
		
	//2.static way: static hashmap;
		System.out.println(HashmapInitialization.markesmap.get("A"));
		System.out.println(HashmapInitialization.markesmap.get("B"));
		
	//3.imutableMap with only single entry
		Map<String,Integer>map3 = Collections.singletonMap("test",100);
		System.out.println(map3.get("test"));
	//map3.put("abc",200);
		//if we add the key and value in the  imutable map it will raise the("UnsupportedOperationException")
	
		//4.	jdk 8;
		//creating ane 2D array of Strings using Stream and collecting in the form Map
		Map<String,String>map4= Stream.of(new String [][] {
			{"Tom","A grade"},
			{"naveen","B grade"},}).collect(Collectors.toMap(date ->date[0],date ->date[1]));
			System.out.println(map4.get("Tom"));
		map4.put("lisa","a++ grade");
		System.out.println(map4.get("lisa"));
		
		//using Simple Entry: imutable method
		Map<String,String>map5=Stream.of(
				new AbstractMap.SimpleEntry<>("gouse","java"),
				  new AbstractMap.SimpleEntry<>("mohammad","python")
				  ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(map5.get("gouse"));
		map5.put("lisa","c#");
		System.out.println(map5.get("lisa"));
	
		
		//JDK1.9
		//emptymap
		Map<String,String>emptymap=Map.of();	
	    //emptymap.put("tom","Python");
		//System.out.println(emptymap.get("tom"));
		//UnsupportedOperationException -->when we try to put value in the String

	   //Singleton map
		Map<String,String>singletonmap=Map.of("k1","v1");
		System.out.println(singletonmap.get("k1"));
		// if we would like to add more than one key,value it will give (UnsupportedOperationException)
		
		//multi Value Map:max 10pairs can be stored :
		
		Map<String,String>multiMap =Map.of("k1", "v1", "k2", "v2","k3","v3","k4", "v4", "k5", "v5");
		
		System.out.println(multiMap.get("k1"));
		
		
		//ofEntries method:no limitation on pairs (key-value) 
		//immutable 
		Map<String, Integer>map8=Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200),
				new AbstractMap.SimpleEntry<>("c",300)
				);
		   
		System.out.println(map8.get("A"));
		
		//Maps using Guava:api from maven dependecies
	//	Map<String,String>titleMaps =ImmutableMap.of("Goolge","GoolgeIndia","Amazon","Amazon Shopping");
		
	}

}
