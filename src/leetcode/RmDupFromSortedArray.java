package leetcode;

import Generics.arrayGenerics.Array;

public class RmDupFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if(nums[i]!=nums[i+1])
                nums[j++]=nums[i];
        }
        nums[j]=nums[n-1];
        return j;
    }

    public static void main(String[] args) {
        RmDupFromSortedArray obj = new RmDupFromSortedArray();
        int[] a={1,1,2};

        for (int i = 0; i <= obj.removeDuplicates(a); i++) {
            System.out.print(a[i]);
        }

    }
}
