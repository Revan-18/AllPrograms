package leetcode;

import java.util.Scanner;

public class LongPaliRepeat {
    static int startsWith = 0;
    static int endsWith = 0;

    public static void main(String[] args) {
        var input = new Scanner(System.in).nextLine();

        for (int sPos = 0; sPos < input.length(); sPos++) {
            findLogestPalindromeSubSeq(input, sPos, sPos);
            findLogestPalindromeSubSeq(input, sPos, sPos + 1);
        }
        System.out.println(input.substring(startsWith,endsWith+1));

    }

    private static void findLogestPalindromeSubSeq(String string, int spos, int epos) {
        int length = string.length();
        while (spos >= 0 && epos < length && string.charAt(spos) == string.charAt(epos)) {
            epos++;
            spos--;
        }
        if (endsWith-startsWith<(epos-spos-1)){
            endsWith=epos-1;
            startsWith=spos+1;
        }

    }
}
