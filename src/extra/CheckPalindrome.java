package extra;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("abba"));
    }

    private static boolean palindrome(String s) {
        int n=s.length();
        int mid1=n/2;
        int mid2=n/2;
        if(n%2==0){
             mid1=n/2-1;
             mid2=n/2;
        }
        while(mid1>=0&&mid2<n&&s.charAt(mid1)==s.charAt(mid2)){
            mid1--;
            mid2++;
        }
        return mid2-mid1-1==n;
    }
}
