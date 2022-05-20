package Recursion.kunal_kushwaha;

import java.util.Scanner;

public class CountZeros {
    public CountZeros() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countzero(n, 0));
    }

    private static int countzero(int i, int c) {
        if (i == 0) {
            return c;
        } else {
            if (i % 10 == 0) {
                ++c;
            }

            return countzero(i / 10, c);
        }
    }
}
