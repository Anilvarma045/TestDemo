package java_learning;

public class ConstructorDemo {

	ConstructorDemo(int a, int b ){
	int c;
	c=a+b;
	System.out.println(c);
	}

public void addition() {
	System.out.println(110+220);
}

public static void main(String args[]) {
	ConstructorDemo d1=new  ConstructorDemo(15, 18); 
	d1.addition();
}
}


