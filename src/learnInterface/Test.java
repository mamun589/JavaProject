package learnInterface;

public class Test {

	public static void main(String[] args) {
	
		C obj = new C();
		
		// we cannot make an object for an interface but we can make object for its implementation class i.e C
		
		obj.baseball();
		obj.chase();
		obj.football();
		obj.play();
		obj.cricket();
		
		// called the method using object
	}

}
