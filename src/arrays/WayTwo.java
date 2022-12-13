package arrays;

public class WayTwo {

	public static void main(String[] args) {

		// using object creation
		
		String[] obj = new String[4];
		// here String is the class name
		// [] is the syntax of array
		// 4 is length of array because here we have to set the limit of the array
		// once the limit is set we can not print over the set up limit
		
		obj[0] = "mamun";
		obj[1] = "abc";
		obj[2] = "def";
		obj[3] = "ijk";
		
		// we can not go to obj[4] because limit is 4
		// if we put obj[4], it will give arrays out of bound exception
		
					//normal way of printing
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		
		System.out.println(obj.length);
		// it will give the length of array
		
		// get length using for loop
		
								// using for loop for printing
		
		for (int i=0; i>=obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	}

}
