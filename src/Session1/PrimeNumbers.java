package Session1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		int num=0;
		String primeNumbers = "";
		System.out.println("ENter the Value of N: ");
		int n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++) {
			int count=0;
			for(num =i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
					
				}
			}
			if(count==2) {
				primeNumbers= primeNumbers+i+" ";
			}
		}
			
		System.out.println("prime numbers are"+primeNumbers);
}
	
}