package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class BasicsHashmap {

	public static void main(String[] args) {
		//no order --no  indexing
		//storesvalues-->key--value<k,v>
		//key can not be duplicated
		//can store n number of null values but only one null key
		//hashmap is not thread-safe
		
		HashMap<String,String>capitalmap=new HashMap<String,String>();
capitalmap.put("India", "NewDelhi");
capitalmap.put("pakistan","islamabad");
capitalmap.put("Australia","Sydney");
//only on key null is allowed 
capitalmap.put(null,"Amaravathi");
capitalmap.put(null,"Hyderabad");
//multiple null values are allowed
capitalmap.put("Russia", null);
capitalmap.put("Chaina", null);

System.out.println(capitalmap.get("India"));
System.out.println(capitalmap.get("Australia"));

System.out.println(capitalmap.get(null));
System.out.println(capitalmap.get(null));

System.out.println(capitalmap.get("china"));
System.out.println(capitalmap.get("russia"));
	//iterator over the keys:by using keySet()
Iterator<String>it=capitalmap.keySet().iterator();
while (it.hasNext()) {
	String key=it.next();
	String value=capitalmap.get(key);
	System.out.println("key=" +key+"    value="+value);
}
//Iterator over the set(pair):by using entrySet
	Iterator<Entry<String,String>>it1=capitalmap.entrySet().iterator();;
	//entry class
	while (it1.hasNext()) {
		Entry<String,String>entry=it1.next();
		 System.out.println("key= "+entry.getKey() +" and value="+entry.getValue());
		 
	}
	//Iterrate hashmap using java 8 for each and lamada;
	capitalmap.forEach((k,v) -> System.out.println("key="+k+"and value="+v));


	
	
	
	
	}
}

