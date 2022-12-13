package learnJava;

public class Car {

	public static void main(String[] args) {
		/* two type of method
		 1.static method- should have the keyword static
		 2. non static method- should not have the static keyword 
		 */
		// main method is always static
		// we need main method for run  the script
		
		Car obj = new Car();    /*we can not call any non static method from static method
								to overcome this situation we need to create object for the 
								 following class i.e Car*/
		
		obj.carDriving();
		obj.carAc();
		obj.carBrake();
		obj.carHorn();
		
		/* here we can call all those non static method by object i.e obj  */
	
	}

	public void carDriving() {
		// method name starts from small letter i.e carDriving
		// method we have to create outside the main method
		// which method starts from public is called public modifier
		// Return type void is means no return because void is void 
		System.out.println("I am Driving");
		// A method has four things( public, void, method name-carDriving, system.pr..) this is the 4 thing
		// public- is a access modifier
		// void- Return type
		//carDrivin- method name
		//System.out.println("I am Driving");--- is body
	}
	
	void carHorn() {
		//the method starts from void is called default/no modifier
		System.out.println("My car horn is very loud");
	}
	
	private void carBrake() {
		// this is called private modifier
		System.out.println("Brake is very hard");
	}
	
	protected void carAc() {
		// protected modifier
		System.out.println("Ac is very good");
	}
}
