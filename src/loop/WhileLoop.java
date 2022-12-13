package loop;

public class WhileLoop {

	public static void main(String[] args) {
		
								// using normal increment
	int i = 1;	
	while (i<=10) {
		System.out.println(i);
		i++;
	}
	
	// if we don't put increment while loop will run infinite
	// if condition failed while loop never run, because increment and sysout is inside the body and condition is before them

	System.out.println("--------------------------------------------");
	
								// way of printing odd number
	int j=1;
	while (j<=10) {
		System.out.println(j);
		j=j+2;	
	}
	
	System.out.println("--------------------------------------------");
	
								// way of printing even number
	int k=0;
	while (k<=10) {
		System.out.println(k);
		k=k+2;	
	}
	
	System.out.println("--------------------------------------------");
	
	String[] obj = new String[4];
	
	obj[0] = "Mamun";
	obj[1] = "Maheel";
	obj[2] = "Shafin";
	obj[3] = "Abc";
	
	int m=0;
	while (m<=3) {
		System.out.println(obj[m]);
		m++;
	}
	
	}

}
