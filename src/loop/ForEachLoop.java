package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] names = {"mamun", "abcd", "efgh", "ijkl", "mnop"};
		// this is the syntax of arrays
		// when we use a lot of data together than we have to use array
		// there should be a [] after the data type
		
		int[] num = {10, 20, 30, 40, 50, 60, 70};
		
		for (String eachname : names) {
			System.out.println(eachname);
		}
		
		for (int eachnum : num) {
			System.out.println(eachnum);
		}
	
		// it is use only in arrays and collection
		// it is use only when we don't know the maximum limit
		/* in syntax String is datatype, eachname is a variable where its store and print each name in every 
		 iteration, names is the collection 
		 */

	}
	

}
