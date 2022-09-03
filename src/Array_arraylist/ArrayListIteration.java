package Array_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String>studentname=new ArrayList<String>();
		studentname.add("gullapalli");
		studentname.add("gouse");	
		studentname.add("mohammad");
		studentname.add("gowse");
		/*for ( int i=0;i<studentname.size();i++) {
			System.out.println(studentname.get(i));
			
		}*/
		for(String s:studentname)
		{
			System.out.println(s);
		}
		//streams with lamada
		studentname.stream().forEach(ele->System.out.println(ele));
		//iterators
		Iterator<String>it=studentname.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
