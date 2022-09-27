package leetcode;

public class Is_Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("ac", "adcb"));
    }
    public static boolean isSubsequence(String s, String t) {
        int j=0;
        int i=0;
        while(i<t.length()&&j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                j++;i++;
            }
            else i++;
        }
        return j==s.length();
    }
}
