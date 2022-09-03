package Array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylistmethod {

	public static void main(String[] args) {
		
ArrayList<String>arl=new ArrayList<String>();
arl.add("java");
arl.add("python");
arl.add("ruby");
arl.add("java Script");
ArrayList<String>ar=new ArrayList<String>();
ar.add("ecllipse");
ar.add("Intellij");
//addAll method;
//arl.addAll(ar);
//System.out.println(arl);
//arl.addAll(2,ar);
//System.out.println(arl);
//clear 
//arl.clear();
//System.out.println(arl);
//clone
ArrayList<String> clonearray=(ArrayList<String>)arl.clone();
System.out.println(clonearray);
ArrayList<String>clone01=(ArrayList<String>)ar.clone();
System.out.println(clone01);
/* contains method*/
System.out.println(arl.contains("java"));
/*IndexOf */
System.out.println(arl.indexOf("java")<0);
/*lastIndexof */
ArrayList<String>lan=new ArrayList<String>(Arrays.asList("java","python","ruby","c","c++"));
System.out.println(lan);
int i=lan.lastIndexOf("ruby");
System.out.println(i);
/*remove()*/
ArrayList<String>names=new ArrayList<String>(Arrays.asList("gouse","yasin","rubeen","Eliyaz"));
System.out.println(names.remove(2));
System.out.println(names);
names.remove("Eliyaz");
System.out.println(names);

/*removeif()*/
ArrayList<Integer>numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//numbers.removeIf(num -> num%2 == 0);
System.out.println(numbers);
numbers.removeIf(num ->num%2 != 0);
System.out.println(numbers);


/*retainAll(Collections.singleton()*/
ArrayList <String>name=new ArrayList<String>(Arrays.asList("siri","mounika","rahul","james","preethi","james"));
System.out.println(name);
name.retainAll(Collections.singleton("james"));
System.out.println(name);
/* sublist*/
ArrayList<Integer>num1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
ArrayList<Integer>sublist=new ArrayList<Integer>(num1.subList(2,6));
System.out.println(sublist);

/*converting arraylist to array */
ArrayList<Integer>listnum=new ArrayList<Integer>(Arrays.asList(10,50,60,90,55));
Object arr[]=listnum.toArray();
System.out.println(Arrays.toString(arr));
for(Object o:arr)
{
	System.out.println(o);
}
	}

}
