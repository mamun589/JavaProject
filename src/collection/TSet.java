package collection;

import java.util.Set;
import java.util.TreeSet;

public class TSet {

	public static void main(String[] args) {
		
		// TreeSet maintain Ascending order
		
		Set<Integer> obj = new TreeSet<>();
		
		// Set should be capital letter all the time
		/* we cannot create an object for an interface i.e Set but we create object for its implementation
		class i.e HashSet or TreeSet or LinkedHashSet
		*/
		// TreeSet should also be capital letter
		// after Set press ctrl+space then add from java.util, after Tree press ctrl+space then java.util
		//sometimes we have to import from Set and TreeSet if it dont come automatic
		
		obj.add(123);
		obj.add(456);
		obj.add(789);
		obj.add(234);
		obj.add(567);
		obj.add(123);
		obj.add(000);
		
		System.out.println(obj.size());
		// duplicate value(123)is not gonna count because it doesnt allow duplicate 
		
		System.out.println("----------------------------");
		
		for (Integer eachobj : obj) {
			System.out.println(eachobj);
		}
		
		System.out.println("----------------------------");

		System.out.println(obj.contains(456));
		
		System.out.println("----------------------------");
		
		obj.remove(456);
		
		System.out.println(obj.contains(456));
		
		System.out.println("----------------------------");
		
		for (Integer eachobj : obj) {
			System.out.println(eachobj);
		}
		
		System.out.println("----------------------------");
		
		obj.clear();
		
		System.out.println(obj.isEmpty());
	}

}
