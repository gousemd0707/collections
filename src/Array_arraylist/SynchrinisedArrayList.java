package Array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchrinisedArrayList {

	public static void main(String[] args) {
		//1.Collections.synchronizedList
		List<String> namelist=Collections.synchronizedList(new  ArrayList<String>());
		namelist.add("bala");
		namelist.add("suri");
		namelist.add("sathi");
		namelist.add("ravi");
		
		System.out.println(namelist);
		
		synchronized (namelist)
		{
		Iterator<String>it=namelist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
					}
		
		//copyOnWriteArrayList-----its ia a class
		CopyOnWriteArrayList<String> schools=new CopyOnWriteArrayList(Arrays.asList("srinivasa","ravi","nandi","lmh"));
		Iterator<String>it=schools.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
	}
	

}
