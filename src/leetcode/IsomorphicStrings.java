package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }
    public static boolean isIsomorphic(String s, String t) {

        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));

        }
        for (int i = 0; i < s.length(); i++) {
            builder.append(map.get(s.charAt(i)));
            builder2.append(map2.get(t.charAt(i)));

        }


        return t.equals(builder.toString()) && s.equals(builder2.toString());
    }
}
