package java_learning;

public class StringDemos{
	public static void main(String args[]) {
		
		String s1="Hi this is Anil varma";
		String s2=s1.replace("varma", "Kumar");
		System.out.println(s2);
		String s3="H#i Th$$%is Va@$ma";
		String s4=s3.replaceAll("[^a-zA-Z0-9 ]","");
		System.out.println(s4.toUpperCase());
		System.out.println(s4.length());
		
		String test1="1000";

		// converting String to Integer using parseInt() method
		int s5= Integer.valueOf(test1);
		System.out.println(s5);
		
		
		System.out.println(Integer.parseInt(test1));
		
		
	}
	
	
}