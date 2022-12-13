package learnJava;

public class Animal {

	public static void main(String[] args) {
	
		Animal obj = new Animal();
		
		obj.horse();
		obj.fox();
		obj.lion();
		obj.elefant();

	}
	
	public void horse() {
		System.out.println("Horse can run very fast");
	}
	
	private void fox() {
		System.out.println("Fox is more clever than any other animal");
	}
	
	protected void lion() {
		System.out.println("Lion is the king of forest");
	}
	
	void elefant() {
		System.out.println("Elefant is one the biggest animal in the world");
	} 

}
