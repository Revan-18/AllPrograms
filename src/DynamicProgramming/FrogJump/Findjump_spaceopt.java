package DynamicProgramming.FrogJump;

import java.util.Arrays;

public class Findjump_spaceopt {
    public static void main(String[] args) {
        int[] stairs = {60,50,60,10,60,10,30};
        int n = stairs.length;
        int curi=0, prev=0, prev2=0;
        for (int i = 1; i < n ; i++) {
            int fs = prev + Math.abs(stairs[i]-stairs[i-1]);
            int ls = Integer.MAX_VALUE;
            if (i>1) ls = prev2 + Math.abs(stairs[i]-stairs[i-2]);

            curi=Math.min(fs,ls);
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }
}
