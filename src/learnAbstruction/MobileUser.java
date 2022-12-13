package learnAbstruction;

public abstract class MobileUser {
	
	// used abstract keyword before the class for all abstract class
	
	void call() {
		System.out.println("I am from call method");
	}
	// this is non abstract class which one is not hiding
	
	abstract void sendMessage();
	abstract void whatsapp();
	abstract void messanger();
	
	// abstract method has no body because is this is hiding but non abstract method has body

}

