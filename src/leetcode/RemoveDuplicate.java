package leetcode;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1])
                res[j++] = nums[i];
        }
        if (nums[n - 2] != nums[n - 1])
            res[j] = nums[n - 1];
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (res[i] != 0)
                r++;
        }
        return r;
    }


}




