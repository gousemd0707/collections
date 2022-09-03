package Array_arraylist;

import java.util.ArrayList;

public class vertualcapacity {
     //physical capacity of array is =0;
	 //vertual capacity fo array is=10;
	//we can increase the vertual capacity by defining in the object;
	  //ArrayList<String> al=new ArrayList<String>(10);
	public static void main(String[] args) {
	ArrayList<Object>ar=new ArrayList<Object>();
	System.out.println(ar.size());
	ar.add(10);
	System.out.println(ar.size());
	System.out.println(ar.get(0));
	ar.add(200);
	ar.add(300);
	ar.add(400); 
	System.out.println(ar.size());
	
	}
	}
