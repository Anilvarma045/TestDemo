package Session1;

public class StringgRev {
public static void main(String args[]) {
	
	String str= "hi Anil";
	System.out.println("before Reverse"+str);
	
	String rev="";
	
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.print(rev);
}
}
