package inheritance;

public class Test {

	public static void main(String[] args) {
		// test class to run the other 3 class
		// this class we gonna execute thats why we used main method here
		
		// we need to create an object if need to use any method from different class 
		BMW obj = new BMW();
		// the object should be the last class which is BMW 
		
		obj.applyBrake();
		obj.applyHorn();
		obj.autoPilot();
		obj.heatedSeat();
		
		// using the object we can call any method
		// here we dont need any sysout statement still it will print every method

	}

}
