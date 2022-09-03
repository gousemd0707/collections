package Array_arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveduplicateElements {

	public static void main(String[] args) {
ArrayList<Integer>numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,4,7,8,9));
//linked Hashset
LinkedHashSet<Integer>linkedhashset=new LinkedHashSet<Integer>(numbers);
ArrayList<Integer>numberslistedwithoutduplicate=new ArrayList<Integer>(linkedhashset);
System.out.println(numberslistedwithoutduplicate);
	
	//JDK -8 Stream  --->method
ArrayList<Integer>markslist=new ArrayList<Integer>(Arrays.asList(1,2,3,1,5,6,7,8,9,4,5,7));
	List<Integer>markesListDemo=markslist.stream().distinct()
.collect(Collectors.toList());	
	System.out.println(markesListDemo);
	//System.out.println(Collections.sort(markesListDemo));
	
	
	
	
	}

}
