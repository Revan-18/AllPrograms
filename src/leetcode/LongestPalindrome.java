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

        ArrayList<Integer> values = new ArrayList<>(map.values());

        values.sort(Collections.reverseOrder());


        Iterator<Integer> it = values.iterator();
        int c = 0;
        int max=0;
        int odd=0;
        if(values.size()<3) {

            while (it.hasNext()) {
                int next=it.next();
                if (next % 2 == 0) {
                    c += next;
                }else
                    if(max<next)
                        max=next;
            }
            return c+max;
        }
        while (it.hasNext()) {
            int next = it.next();
            if (next % 2 == 0) {
                c += next;
            } else {
                odd++;
                if (next > 1)
                    c+=next-1;
                else if(next==1)
                    max=next;
            }
        }
        if(odd>=1&&max ==1) {
            return c + max;
        }
        else if(odd==0)
              return c+max;
            return c+max+1;


    }
}
