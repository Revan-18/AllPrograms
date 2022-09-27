package recursion.kunal_kushwaha;

public class Steps_Count_leetcode {
    static int c = 0;

    public Steps_Count_leetcode() {
    }

    public static void main(String[] args) {
        System.out.println(steps(41));
        System.out.println(steps2(14, 0));
    }

    private static int steps(int i) {
        if (i == 0) {
            return c;
        } else if (i % 2 != 0) {
            ++c;
            --i;
            return steps(i);
        } else {
            ++c;
            return steps(i / 2);
        }
    }

    private static int steps2(int n, int c) {
        if (n == 0) {
            return c;
        } else if (n % 2 == 0) {
            int var10000 = n / 2;
            ++c;
            return steps2(var10000, c);
        } else {
            --n;
            ++c;
            return steps2(n, c);
        }
    }
}

