package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int maxLength = lengthOfLongestSubstring("dvdf");
        System.out.println(maxLength);

    }
    public static int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        Map<Character,Integer> map = new HashMap<>();
        for (int start = 0,last=0; last < s.length(); last++) {
            char currentChar = s.charAt(last);
            if(map.containsKey(currentChar)&&map.get(currentChar)>=start){
                start=map.get(currentChar)+1;
            }
            maxlength=Math.max(maxlength,last-start+1);
            map.put(s.charAt(last),last);

        }
        return maxlength;

    }
}
