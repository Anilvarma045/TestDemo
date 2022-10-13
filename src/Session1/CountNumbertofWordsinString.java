package Session1;

public class CountNumbertofWordsinString {
public static void main(String args[]) {
	
	String s="Hi this is Anil varma";
	
	int count=1;
for(int i=0;i<s.length()-1;i++) {
	if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
		count++;
	}

}

System.out.println("the total word count is      "+count);
}
}
