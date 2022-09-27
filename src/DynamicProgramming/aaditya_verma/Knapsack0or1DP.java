package DynamicProgramming.aaditya_verma;

import java.util.Arrays;

public class Knapsack0or1DP {
    static int t[][] = new int[102][1000];

    public static void main(String[] args) {
        Arrays.stream(t).forEach(a -> Arrays.fill(a, -1));
        System.out.println(knapsack(new int[]{1, 3, 4, 5}, new int[]{1, 4, 5, 7}, 9, 4));

    }
    static int knapsack(int[] wt, int[] val, int w, int n){

        if(w==0||n==0)
            return 0;
        if(t[n][w]!=-1)
            return t[n][w];
        if(wt[n-1]<=w)
            return t[n][w]=Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1),
            knapsack(wt,
                    val, w, n - 1));
        else if(wt[n-1]>w)
            return t[n][w]=knapsack(wt, val, w, n - 1);
        return 0;
    }
}
