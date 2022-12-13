package arrays;

public class WayOne {

	public static void main(String[] args) {
		
		
		
		String[] names = {"mamun", "abcd", "efgh", "ijkl", "mnop"};
		// this is the syntax of arrays
		// when we use a lot of data together than we have to use array
		// there should be a [] after the data type
		
		int[] num = {10, 20, 30, 40, 50, 60, 70};
		
					//normal way of printing
		
		System.out.println(names[0]);
		// if we want to print any single name then we have to use indexing.
		// here we put 0 thats why its print mamun because index starts from 0
		
		System.out.println(num[3]);
		
		
					// using for loop for printing
		
		for (String eachname : names) {
			System.out.println(eachname);
		}
		
		for (int eachnum : num) {
			System.out.println(eachnum);
		}
	
		// it is use only in arrays and collection
		// it is only when we don't know the maximum limit
		/* in syntax String is datatype, eachname is a variable where its store and print each name in every 
		 iteration, names is the collection 
		 */
	
	}

}
