package leetcode;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] ints = runningSum(new int[]{1, 2, 3, 4, 5});
        for (int i:ints) {
            System.out.println(i);
        }
    }
    public static int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){
            nums[i]+=+nums[i-1];
        }
        return nums;
    }
}
