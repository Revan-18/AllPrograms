package leetcode;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x > 0 && x < 10) {
            return true;
        }
        int x1 = x;
        int n = (int) Math.log10(x) + 1;

        int p = 0;
        for (int i = 0; i < n; i++) {
            p *= 10;
            p = p + x % 10;
            x = x / 10;

        }
        System.out.println(p);
        return p == x1;

    }


    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        // int x  = (new Scanner(System.in)).nextInt();
        System.out.println(p.isPalindrome(121));
    }
}


