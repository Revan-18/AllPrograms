package Recursion.kunal_kushwaha;

public class Nto1 {
    public Nto1() {
    }

    public static void main(String[] args) {
        fun(4);
    }

    static void fun(int n) {
        if (n != 0) {
            System.out.println(n);
            fun(n - 1);
        }
    }
}
