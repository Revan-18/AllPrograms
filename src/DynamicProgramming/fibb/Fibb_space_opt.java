package DynamicProgramming.fibb;

import java.util.Scanner;

public class Fibb_space_opt {
    public static void main(String[] args) {
        int prev = 1, prev2 = 0, curi;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
        System.out.println(tribonacci(n));
    }

        public static int tribonacci ( int n){
            int prev = 0, prev1 = 1, prev2 = 1, cur = 0;
            if (n == 0 || n == 1)
                return n;
            if (n == 2) return 1;
            for (int i = 3; i <= n; i++) {
                cur = prev + prev1 + prev2;
                prev = prev1;
                prev1 = prev2;
                prev2 = cur;
            }
            return prev2;

        }
    }