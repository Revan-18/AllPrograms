package recursion.kunal_kushwaha;

public class sorted_or_not {
    public sorted_or_not() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 1};
        if (check(arr, 0)) {
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }

    }

    private static boolean check(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        } else {
            return arr[i] < arr[i + 1] && check(arr, i + 1);
        }
    }
}
