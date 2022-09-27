package recursion.kunal_kushwaha;

import java.util.Scanner;

public class SumofN {
    public SumofN() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n) {
        if (n < 1) {
            return n;
        } else {
            return n == 1 ? 1 : n + sum(n - 1);
        }
    }
}
