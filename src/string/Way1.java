package string;

public class Way1 {

	public static void main(String[] args) {
		
		String text = "String Concept";
		String text1 = "String Concept";
		
					// to see the memory location of the value of the variable 
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		// if the value of the two string type variable are same, java gonna use the same memory location
		
		System.out.println("---------------------------------------------");
		
					// use of equals method, result is true/ false
		System.out.println(text.equals(text1));
		
		System.out.println("---------------------------------------------");
		
					// use of length method
		System.out.println(text.length());
		System.out.println(text1.length());
		
		System.out.println("---------------------------------------------");
		
					// use of concat(concatination) method
		String num = "20";
		String num1 = "30";
		int num3 = 40;
		int num4 = 50;
		
		System.out.println(text.concat(text1));
		// if we need to use space between two value
		System.out.println(text + " " + text1);
		
		System.out.println(num.concat(num1));
		System.out.println(num + num3);
		System.out.println(num3 + num4);
		
		//if both of the data is string then concat gonna join side by side i.e 2030
		// if one data is string and another data is int then concat gonna join side by side i.e 2040
		// if both of the data is int then concat gonna add i.e 90
		
		System.out.println("---------------------------------------------");
		
					// use of trim method 
		String text3 = "    How are you       ";
		System.out.println(text3.trim());
		// trim only cut the empty space in front and back
		
		System.out.println("---------------------------------------------");
		
					// use of toLowerCase method
		String text4 = "MY NAME IS MAMUN";
		System.out.println(text4.toLowerCase());
		
		System.out.println("---------------------------------------------");
		
					// use of toUpperCase method
		String text5 = "my name is mamun";
		System.out.println(text5.toUpperCase());
		
		System.out.println("---------------------------------------------");
		
					// use contains method, return true/ false
		String text6 = "today is saturday";
		System.out.println(text6.contains("tur"));
		// tur from the word saturday
		System.out.println(text6.contains("abc"));
		// abc we dont have here, so result will be false

	}

}
