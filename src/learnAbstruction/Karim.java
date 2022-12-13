package learnAbstruction;

public class Karim extends MobileUser {
	
	void sendMessage() {
		System.out.println("I am from Karim");
	}

	@Override
	void whatsapp() {
		System.out.println("Whatsapp is the most popular site for me");
		
	}

	@Override
	void messanger() {
		
		System.out.println("messanger belongs to Facebook");
	}

}
