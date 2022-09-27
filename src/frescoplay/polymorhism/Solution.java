package frescoplay.polymorhism;

import java.util.Scanner;

abstract class Parent {
	public abstract String[] filter(int s,int e) ;
		
}

class ChildOne extends Parent{

	@Override
	public String[] filter(int s, int e) {
		String[] array = new String[e-s];
		int j=0;
		for (int i = s; i <= e; i++) {
			if(!prime(i)) {
				if(i>1)
				array[j++]=String.valueOf(i);
			}
		}
		
		return array;
	}
	
	static boolean prime(int n) {
		
		int i;
		for (i = 2; i <= n/2; i++) {
			if (n%i==0) 
				return true;
		}
		return false;
	}
	
}

class ChildTwo extends Parent{

	@Override
	public String[] filter(int s, int e) {
		
		String num[] = new String[e-s];
		int j=0;
		
		for (int i = s; i <= e; i++) {
		 if(happy(i))
			 num[j++]=String.valueOf(i);
		}
		
		return num;
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

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		Parent a = new ChildOne();
		Parent b = new ChildTwo();
		String[] ia= a.filter(s,e);
		String[] sb= b.filter(s,e);
		for (String v : ia)
			if(v!=null)
			System.out.print(v+" ");
		
		System.out.println();
		for (String v1 : sb)
			if(v1!=null)
			System.out.print(v1+" ");
		
		
	}

}
