package collection;

import java.util.HashSet;
import java.util.Set;

public class HSet {

	public static void main(String[] args) {
		
		// HashSet maintain random order
		
		Set<Integer> obj = new HashSet<Integer>();
		
		// Set should be capital letter all the time
		/* we cannot create an object for an interface i.e Set but we create object for its implementation
		class i.e HashSet or TreeSet or LinkedHashSet
		*/
		// HashSet should also be capital letter
		// after Set press ctrl+space then add from java.util, after Hash press ctrl+space then java.util
		//sometimes we have to import from Set and HashSet if it dont come automatic
		
		obj.add(123);
		obj.add(456);
		obj.add(789);
		obj.add(234);
		obj.add(567);
		obj.add(123);
		obj.add(000);
		
		System.out.println(obj.size());
		// duplicate value(123)is not gonna count becuse it doesnt allow duplicate 
		
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

