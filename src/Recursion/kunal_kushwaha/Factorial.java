package Recursion.kunal_kushwaha;

public class Factorial {
    public Factorial() {
    }

    public static void main(String[] args) {
        System.out.println(fact(0));
    }

    static int fact(int n) {
        return n < 2 ? 1 : n * fact(n - 1);
    }
}
