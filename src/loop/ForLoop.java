package loop;

public class ForLoop {

	public static void main(String[] args) {
		
							// using normal increment
		for (int i=1; i<=10; i++) {  //i=i+1 can put instead of i++
			System.out.println(i);
		}
		
		// when we know the minimum and maximum limit then we use for loop
		
		System.out.println("--------------------------------------------");
		
							// way of printing odd number
		for (int j=1; j<=10; j=j+2) {
			System.out.println(j);
		}
		
		System.out.println("--------------------------------------------");
		
							// way of printing even number
		for(int k=2; k<=10; k=k+2) {
			System.out.println(k);
		}
		
		System.out.println("--------------------------------------------");

		String[] obj = new String[4];
		
		obj[0] = "Mamun";
		obj[1] = "Maheel";
		obj[2] = "Shafin";
		obj[3] = "Abc";
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		//in case of string we have use length function because names have no integer value
		
	}

}
