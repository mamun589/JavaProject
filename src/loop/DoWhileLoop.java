package loop;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int i =1;
		
		do {
			System.out.println(i);
			i++;
		} while (i<10);

		/* do while loop can run at least one time even if the condition is false because condition of 
		 do while loop is out side the body of the loop
		 */
		
		System.out.println("--------------------------------------------");
		
		String[] obj = new String[4];
		
		obj[0] = "Mamun";
		obj[1] = "Maheel";
		obj[2] = "Shafin";
		obj[3] = "Abc";
		
		int j=0;
		do {
			System.out.println(obj[j]);
			j++;
		} while (j<obj.length);
		
		
	}

}
