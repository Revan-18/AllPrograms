package leetcode;

public class LongestPalisubseq {
    public int startsWith;
     public int endsWith;
    public String largePalindromesSubSeq(String value){
        int length = value.length();
        if(length<2)
            return value;

        for (int i = 0; i < value.length(); i++) {
            expand(value,i,i);
            expand(value,i,i+1);
        }
        return value.substring(startsWith,endsWith+1);
    }

    public void expand(String value,int start,int end){

        while((start>=0&&end<value.length()-1)&&(value.charAt(start)==value.charAt(end))){
            start--;
            end++;
        }
        if((endsWith-startsWith)<(end-start-1))
        {
            startsWith=start+1;
            endsWith=end-1;
        }
    }
}
class solution99{
    public static void main(String[] args) {
        LongestPalisubseq longestPalisubseq = new LongestPalisubseq();
        System.out.println(longestPalisubseq.largePalindromesSubSeq("ababcdcbaab"));
    }
}