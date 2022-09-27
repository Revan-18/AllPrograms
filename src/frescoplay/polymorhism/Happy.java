package frescoplay.polymorhism;

import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		int i=new Scanner(System.in).nextInt();

		int digits=1+(int)Math.log10(i);
		 System.out.println(happy(i));

	}
	
	static boolean happy(int n) {
		if(n==4)
			return false;
		if(n==1)
			return true;
		int digits = 1 + (int) Math.log10(n);
		int sum=0;
		int temp=n;
		for(int i = 0; i< digits; i++) {
			sum=sum+(int)Math.pow(temp%10, 2);
			temp/=10;
		}
		
		return happy(sum);
	}

}
