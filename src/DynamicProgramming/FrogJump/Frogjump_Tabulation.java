package DynamicProgramming.FrogJump;

import java.util.Arrays;

public class Frogjump_Tabulation {
    public static void main(String[] args) {
        int[] stairs = {60,50,60,10,60,10,30};
        int n = stairs.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for (int i = 1; i < n ; i++) {
            int fs = dp[i-1] + Math.abs(stairs[i]-stairs[i-1]);
            int ls = Integer.MAX_VALUE;
            if (i>1) ls = dp[i-2] + Math.abs(stairs[i]-stairs[i-2]);

            dp[i]=Math.min(fs,ls);
        }
        System.out.println(dp[n-1]);
    }
}
