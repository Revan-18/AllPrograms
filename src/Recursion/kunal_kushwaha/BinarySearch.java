package Recursion.kunal_kushwaha;

public class BinarySearch {
    public BinarySearch() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 55, 66, 78};
        int target = 10;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        } else {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            } else {
                return arr[m] > target ? search(arr, target, s, m - 1) : search(arr, target, m + 1, e);
            }
        }
    }
}
