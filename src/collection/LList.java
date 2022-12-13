package collection;

import java.util.LinkedList;
import java.util.List;

public class LList {

	public static void main(String[] args) {
		
		//create object of Linkedlist-class
		
		List<Integer> id = new LinkedList<Integer>();
		
		// List should be capital letter all the time
		/* we cannot create an object for an interface i.e List but we create object for its implementation
		 class i.e ArrayList or LinkedList
		 */
		// LinkedList should also be capital letter
		// after List press ctrl+space then add from java.util, after Linked press ctrl+space then java.util
		//sometimes we have to import from List and LinkedList if it dont come automatic
				
								// add item in the list
		
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(50);
		id.add(60);
		
		// print all item from the list
		System.out.println(id);
		
		// check size of the list
		System.out.println(id.size());
		
		System.out.println("------------------------------------------------");
		
		// add another item in the list
		id.add(70);
		
		// after adding print again to see
		System.out.println(id);
		
		System.out.println(id.size());
		
		System.out.println("------------------------------------------------");
		
		// print particular item from the list use indexing
		System.out.println(id.get(4));
				
		System.out.println("------------------------------------------------");
		
		// print all item from the list using for loop
		for (int i=0; i<id.size(); i++) {
			System.out.println(id.get(i));
		}
		/* i starts from 0 because of indexing, i i less than total size of the list(emp.size)
		 then print anything we use get and i will be use for printing all the item
		*/
				
		System.out.println("------------------------------------------------");
		
		// remove item from the list
		id.remove(2);
				
		// after remove print whole list to check its removed or not
				for (int i=0; i<id.size(); i++) {
					System.out.println(id.get(i));
				}
				
		System.out.println("------------------------------------------------");
		
		// to verify we have particular item in the list, we use contains function
		// result will be true/false
		System.out.println(id.contains(80));
		System.out.println(id.contains(50));
				
		System.out.println("------------------------------------------------");
		
		// to delete all the items from the list
		id.clear();
				
		// to verify the list is empty or not we use isempty function
		// result will be true or false
		System.out.println(id.isEmpty());
		

	}

}
