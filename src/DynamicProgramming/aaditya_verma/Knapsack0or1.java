package DynamicProgramming.aaditya_verma;

public class Knapsack0or1 {
    public static void main(String[] args) {
        System.out.println(knapsack(new int[]{1, 3, 4, 5}, new int[]{1, 4, 5, 7}, 9, 4));
    }
    static int knapsack(int[] wt, int[] val, int w, int n){
        if(w==0||n==0)
            return 0;
        if(wt[n-1]<=w)
            return Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1), knapsack(wt,
                    val, w, n - 1));
        else if(wt[n-1]>w)
            return knapsack(wt, val, w, n - 1);
        return 0;
    }

}
