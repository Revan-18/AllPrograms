package leetcode;

import java.util.Scanner;

public class Longest_Comm_prefix {

    static int count(String[] str) {

        int count = 0;
        for (String el : str)
            if (el != null)
                ++count;
        return count;
    }

    public static String longestCommonPrefix(String[] strs) {
        int a = 0;
        int min = strs[0].length();
        for (int i = 0; i < count(strs) - 1; i++) {
            int ne = 0;
            for (int j = 0; j < (a = Math.min(strs[i].length(), strs[i + 1].length())); j++) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    ne++;
                } else break;
            }
            if (ne < min) {
                min = ne;
            }
        }
        return strs[0].substring(0, min);
    }

    public static void main(String[] args) {
        String[] str = new String[200];
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            str[i] = new Scanner(System.in).nextLine();
        }
        System.out.println(longestCommonPrefix(str));

    }
}
