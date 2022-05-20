package Cp_with_algo_impi;
//competitive programming with algorithm implimentation.

import java.util.Scanner;

public class Dp_Fib {   //Dynamic programming on fibonacci series

    public final int MAX = 100;
    public final int NIL = -1;

    int dp1[] = new int[MAX];

    public Dp_Fib() {
        for (int i = 0; i < MAX; i++) {
            dp1[i] = NIL;
        }
    }

    public int fib(int n) {
        if (dp1[n] == NIL) {
            if (n <= 1)
                dp1[n] = 1;
            else
                return dp1[n] = fib(n - 1) + fib(n - 2);
        }
        return dp1[n];
    }

    public static void main(String[] args) {
        Dp_Fib dp = new Dp_Fib();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dp.fib(n));
    }
}
