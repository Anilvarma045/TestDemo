package Session1;

public class AlternateChar {

	public static void main(String args[]) {
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String nstr="";
		char[] a=str.toCharArray();
		for(int i=0; i<=a.length-1;i++) {   //for(int i=0; i<str.length()-1;i++) we use as a String also 
			if(i%2==0) {
				nstr=nstr+str.charAt(i);      //
				
			}
			
		}
		System.out.println(nstr);
		
		
	}
}