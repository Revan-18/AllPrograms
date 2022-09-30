package leetcode;

import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome(
                "abccccdd"));
    }
    public static int longestPalindrome(String s) {
        int length = s.length();
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            Character current = s.charAt(i);
            if(map.containsKey(current)) {
                Integer integer = map.get(current);
                map.put(s.charAt(i),++integer);
            }else  map.put(current,1);
        }
        int c=0;
        int odd=0;
        for(int v:map.values()){
            if(v%2==0){
                c+=v;
            }else {
                odd++;
                if(odd>1)
                    c=c+(v-1);
                else c+=v;

            }
        }
        return c;
    }
}
