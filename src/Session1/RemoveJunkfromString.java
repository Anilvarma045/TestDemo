package Session1;

public class RemoveJunkfromString {
public static void main(String args[]) {
	
	String str= "Hi@id#iot F@@l ^&im@";
	String mystr=str.replaceAll("[^a-zA-Z0-9]","");
			System.out.println(mystr);	
}
}
