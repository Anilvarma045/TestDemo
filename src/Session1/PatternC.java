package Session1;

public class PatternC {
	
	public static void main(String args[]) {
		
	/*	int n=10;
		int sp= n-1;     // sp for number of spaces
		int st = 1;      // st means number of Stars
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			for(int j=1; j<=st; j++) {
				System.out.println("*\t");
			}
		}
		
		
	}

}   */
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");   
			}
			System.out.println();
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
