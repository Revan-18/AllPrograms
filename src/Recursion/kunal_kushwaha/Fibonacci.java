package Recursion.kunal_kushwaha;

import java.util.Scanner;

public class Fibonacci {
    public Fibonacci() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        return n < 2 ? n : fibo(n - 1) + fibo(n - 2);
    }
}