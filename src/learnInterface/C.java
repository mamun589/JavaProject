package learnInterface;

public class C implements A, B {
	
	// use implements keyword instead of extends
	// we can extends(implements) 2 superclass in interface using , i.e A,B
	// then we have to import from c "add unimplemented method
	
	public void chase() {
		System.out.println("chase");
		
	}

	public void play() {
		System.out.println("play");
		
	}

	public void football() {
	System.out.println("football");
		
	}

	public void baseball() {
	System.out.println("baseball");
		
	}

	// the methods above from the super class A and B
	// use sysout statement in the body
	
	public void cricket() {
		System.out.println("Shaheed Afridi");
	}
	
	// subclass could have their own method

}
