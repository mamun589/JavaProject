package learnConstructor;

public class Human {
	
	String name, gender;
	int idNo;
	
	Human(){
		System.out.println("No Data");
	}
	
	Human(String n, String g){
		name = n;
		gender = g;
	}
	
	Human(String n, String g, int i){
		name = n;
		gender = g;
		idNo = i;
	}
	
	void displayInfo() {
		System.out.println("name: "+name);
		 System.out.println("gender: "+gender);
		 System.out.println("idNo: "+idNo);
	}
	
	public static void main(String[] args) {
		 Human human = new Human();
		 human.displayInfo();
		 
		 Human human1 = new Human("Shafin chy", "Male");
		 human1.displayInfo();
		 
		 Human human2 = new Human("Tazin chy", "Feamle");
		 human2.displayInfo();
	 }

}
