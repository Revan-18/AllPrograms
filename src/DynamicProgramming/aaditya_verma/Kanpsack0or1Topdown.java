package DynamicProgramming.aaditya_verma;


public class Kanpsack0or1Topdown {
    public static void main(String[] args) {

        System.out.println(knapsack(new int[]{1, 3, 4, 5}, new int[]{1, 4, 5, 7}, 9, 4));

    }
    static int knapsack(int[] wt, int[] val, int w, int n){
         int t[][] = new int[n+1][w+1];
         int i;
         int j = 0;

        for ( i = 0; i < n+1; i++) {
            for ( j = 0; j < w+1; j++) {
                if(i==0||j==0)
                    t[i][j]=0;
                else if(wt[i-1]<=j)
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                else if(wt[i-1]>j)
                    t[i][j]=t[i-1][j];
            }
            
        }
        return t[i-1][j-1];
    }
}
