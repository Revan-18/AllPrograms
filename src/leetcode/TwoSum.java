package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 7, 11, 13}, 20);
        for (int a : ints) {
            System.out.println(a);
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer currentIndex = map.get(nums[i]);
            if (currentIndex != null) {
                return new int[]{i, currentIndex};
            }
            map.put(target - nums[i], i);
        }
        return nums;
    }
}
