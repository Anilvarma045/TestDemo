package java_learning;

public class Methods {
public static void main(String args[]) {
	System.out.println("Java Basics Concepts");
	// static method calling with direct class name
	Methods.calculation1();
	//non static method calling with Object creation
	Methods c1=new Methods();
	c1.calculation2(5, 4);
	
}
	// a java method with Static variable
	public static void calculation1() {
		int a=10,b=20;
		String s1= "basic cal";
		System.out.println(s1+" "+a+b);
}
	// a java method with Non static method and passing parameters
	public void calculation2(int a, int b) {
	//	a=30;
	//	b=40;
		String cal2="basic cal2";
		System.out.println(cal2+" "+a+b);
		
	}
	
	
	
	
}
