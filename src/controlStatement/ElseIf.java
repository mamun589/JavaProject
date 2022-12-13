package controlStatement;

public class ElseIf {

	public static void main(String[] args) {
	
		int D = 6;
		
		if (D>6) {
			System.out.println("Diabetic");
		} else if (D<6) {
			System.out.println("Non Diabetic");
		} else if (D>7) {
			System.out.println("Poor Control");
		} else {
			System.out.println("Pre Diabetic");
		}
		
		System.out.println("----------------------------");
		
		String Browser1 = "Chrome";
		String Browser2 = "FireFox";
		String Browser3 = "IE";
		
		if (Browser1.equals("Gecko")) {
			System.out.println("Chrome");
		} else if (Browser2.equals("FireFox")) {
			System.out.println("FireFox");
		} else if (Browser3.equals("IE")) {
			System.out.println("IE");
		} 
		
		/* it will check every condition of "if", "else if" and "else if", if any condition is true, it
		 will print that particular statement but if none of the condition true it will print automatically 
		 the statement of "else"
		 */

	}

}
