package leetcode;

import java.util.Arrays;

public class PivotIndex {


    public static void main(String[] args) {
        System.out.println(new PivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public int pivotIndex(int[] nums) {
         int t[][] = new int[10000][10000];
        Arrays.stream(t).forEach(a -> Arrays.fill(a, -1));
        int n = nums.length;


        for (int i = 0; i < n; i++) {
            if((t[0][i-1]!=-1)&&(t[i+1][n-1]!=-1))
                return 1;
            if((t[0][i-1]=sum(nums, 0, i - 1))==(t[i+1][n-1]=sum(nums, i + 1, nums.length - 1)))
                return 1;
        }
        return -1;
    }

    public int sum(int[] nums, int start, int end) {
        int sums = 0;
        for (int i = start; i <= end; i++)
            sums = sums + nums[i];
        return sums;

    }

}
