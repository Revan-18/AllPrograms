package leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int maxLength = lengthOfLongestSubstring("abcabefgabcd");
        System.out.println(maxLength);

    }
    public static int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(builder.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                builder.append(s.charAt(j));
                maxlength = Math.max(builder.length(), maxlength);
            }

        }
        return maxlength;

    }
}
