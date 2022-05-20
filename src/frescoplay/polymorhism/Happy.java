package frescoplay.polymorhism;

public class Happy {

	public static void main(String[] args) {
		int i=2;
		int digits=1+(int)Math.log10(i);
		 System.out.println(happy(i,digits));

	}
	
	static boolean happy(int n,int digits) {
		if(n==4)
			return false;
		if(n==1)
			return true;
		digits = 1+ (int)Math.log10(n);
		int sum=0;
		int temp=n;
		for(int i=0;i<digits;i++) {
			sum=sum+(int)Math.pow(temp%10, 2);
			temp/=10;
		}
		
		return happy(sum,digits);
	}

}
