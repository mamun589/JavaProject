package collection;

import java.util.ArrayList;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		
		//create object of arraylist-class
		
		List<String> emp = new ArrayList<String>();
		// List should be capital letter all the time
		/* we cannot create an object for an interface i.e List but we create object for its implementation
		 class i.e ArrayList or LinkedList
		 */
		// ArrayList should also be capital letter
		// after List press ctrl+space then add from java.util, after Array press ctrl+space then java.util
		//sometimes we have to import from List and ArrayList if it dont come automatic
		
						// add item in the list
		emp.add("mamun");
		emp.add("abc");
		emp.add("efg");
		emp.add("xyz");
		
		// print all item from the list
		System.out.println(emp);
		
		// check size of the list
		System.out.println(emp.size());
		
		System.out.println("------------------------------------------------");
		
		// add another item in the list
		emp.add("mamun");
		
		// after adding print again to see
		System.out.println(emp);
		
		System.out.println(emp.size());
		
		System.out.println("------------------------------------------------");
		
		// print particular item from the list use indexing
		System.out.println(emp.get(2));
		
		System.out.println("------------------------------------------------");
		
		// print all item from the list using for loop
		for (int i=0; i<emp.size(); i++) {
			System.out.println(emp.get(i));
		}
		/* i starts from 0 because of indexing, i i less than total size of the list(emp.size)
		  then print anything we use get and i will be use for printing all the item
		 */
		
		
		// print all item using smart for each loop
		for (String eachEmp : emp) {
			System.out.println(eachEmp);
		}
		
		System.out.println("------------------------------------------------");
		
		// remove item from the list
		emp.remove(0);
		
		// after remove print whole list to check its removed or not
		for (int i=0; i<emp.size(); i++) {
			System.out.println(emp.get(i));
		}
		
		System.out.println("------------------------------------------------");
		
		// to verify we have particular item in the list, we use contains function
		// result will be true/false
		System.out.println(emp.contains("hij"));
		System.out.println(emp.contains("mamun"));
		
		System.out.println("------------------------------------------------");
		
		// to delete all the items from the list
		emp.clear();
		
		// to verify the list is empty or not we use isempty function
		// result will be true or false
		System.out.println(emp.isEmpty());

	}

}
