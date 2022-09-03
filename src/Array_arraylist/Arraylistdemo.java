package Array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistdemo {

	public static void main(String[] args) {
	
	//static array index	
	/*int i[]=new int[4];
	 i[0]=100;
	 System.out.println(i[0]);
     System.out.println(i[5]);*/
		
		//default class
		//dynamic array
		//default generics:
		  
		ArrayList<Object> ar =new ArrayList<Object>();
		ar.add(100);
		ar.add("gouse");
		ar.add('a');
		ar.add(10.2);
		ar.add(true);
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(0);
		System.out.println(ar.size()-1);
		ar.add(50);
		System.out.println(ar);
		System.out.println(ar.get(5));
		System.out.println(ar.size());
		
		ArrayList<Integer>number=new ArrayList<Integer>(Arrays.asList(10,20,30,50));
		System.out.println(number);
		number.add(30);
		System.out.println(number.size());
		System.out.println(number);
		ArrayList<String>names=new ArrayList<String>(Arrays.asList("gouse","gullaplli"));
		System.out.println(names);
		System.out.println(names.size());
	}

}
