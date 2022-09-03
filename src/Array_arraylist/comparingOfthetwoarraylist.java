package Array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class comparingOfthetwoarraylist {

	public static void main(String[] args) {
		// compaaring two Arrays by equals
		 ArrayList<String> A01=new ArrayList<String>(Arrays.asList("A","B","C","D"));
		 ArrayList<String>A02=new ArrayList<String>(Arrays.asList("A","B","D","C"));
		 Collections.sort(A01);
		 Collections.sort(A02);
		 System.out.println(A01.equals(A02));
		 //compare the two list and find out the additional element--->removeall
		 ArrayList<String>A03=new ArrayList<String>(Arrays.asList("x","y","z","a","b"));
		 ArrayList<String>A04=new ArrayList<String>(Arrays.asList("x","y","z","a","c"));
		 	//A03.removeAll(A04);
	    //System.out.println(A03);
	    	A04.removeAll(A03);
	    	System.out.println(A04);
	    	
	    	
	    	//find out the common String values
	    	ArrayList<String>lan01=new ArrayList<String>(Arrays.asList("java","python","ruby","c#","javascript"));
	    	ArrayList<String>lan02=new ArrayList<String>(Arrays.asList("java","python","ruby","c#","php"));
	    	lan01.retainAll(lan02);
	    	System.out.println(lan01);
	    	
	    	
	
	}

}
