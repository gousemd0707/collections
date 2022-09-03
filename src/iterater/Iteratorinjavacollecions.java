package iterater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iteratorinjavacollecions {
  /*methods 1.hasNext()---> to cheak next element is present or not
			2.next();--->to got fro the next element
			3.remove()----> to remove froom thr list
			*/
			
	public static void main(String[] args) {
	ArrayList<String>Animals=new ArrayList<String>(Arrays.asList("goat","elephant","white tiger","Bengal tiger","dog"));
			System.out.println(Animals);
			Iterator<String>animal=Animals.iterator();
			while (animal.hasNext())
			{
				String value=animal.next();
				System.out.println(value);
				if (value.equals("elephant"));
				animal.remove();
			}
			
			
		/* */	
			
			/*for(String Animal:Animals)
			{
				System.out.println(Animal);
			}*/

	}

}
