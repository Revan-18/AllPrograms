package DynamicProgramming.FrogJump;

import java.util.Arrays;

public class Frogjump {
    public static void main(String[] args) {
        int[] stairs = {60,50,60,10,60,10,30};
        int n = stairs.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(jump(n-1,stairs,dp));
    }

    private static int jump(int i, int[] stairs, int[] dp) {
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne = jump(i-1,stairs,dp)+Math.abs(stairs[i]-stairs[i-1]);
        if(i>1)
        jumpTwo = jump(i-2,stairs,dp)+Math.abs(stairs[i]-stairs[i-2]);
        return dp[i]= Math.min(jumpOne,jumpTwo);
    }
}
