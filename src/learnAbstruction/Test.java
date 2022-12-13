package learnAbstruction;

public class Test {

	public static void main(String[] args) {
		
        MobileUser mu; 
        // we cannot create an object of abstract class but we can create reference variable of the superclass
        // this is how we create reference class
		
		mu = new Rahim();
		mu.sendMessage();
		mu.call();
		mu.messanger();
		mu.whatsapp();
		
		mu = new Karim();
		mu.call();
		mu.sendMessage();
		mu.whatsapp();
		mu.messanger();
		
		// then this is how we call the methods 

	}

}
