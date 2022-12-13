package learnJava;

public class Addition {

	public static void main(String[] args) {
		
		addTwoNum(20, 30);
		addTwoString("Hello", " World");

	}
	
	public static int addTwoNum(int a, int b) {
		System.out.println(a+b);
		return a+b;
		
	}
	
	public static String addTwoString(String x, String y) {
		System.out.println(x+y);
		return x+y;
	}
	
	// we can call directly a static method i.e addTwoNum from inside the main static method
	// but we can not call a non static method from a static method directly 
	// for that we have create an object of the same class then we can call from main static method
	// check Car and Animal class from the same package

}
