package Recursion.kunal_kushwaha;

public class Nto1_infinite_recursion {
    public Nto1_infinite_recursion() {
    }

    public static void main(String[] args) {
        fun(4);
    }

    static void fun(int n) {
        if (n != 0) {
            System.out.println(n);
            fun(n--);
        }
    }
}