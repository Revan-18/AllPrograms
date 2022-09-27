package recursion.kunal_kushwaha;

public class Sum_Prod_Rever_digit {
    static int sum = 0;

    public Sum_Prod_Rever_digit() {
    }

    public static void main(String[] args) {
        System.out.println(sum(1234));
        System.out.println(prod(505));
        System.out.println(rever(1002));
        System.out.println(rever2(1002));
        System.out.println(rever3(1002, 0));
        System.out.println(palindrome(12321));
    }

    private static boolean palindrome(int i) {
        return i == rever2(i);
    }

    static int sum(int n) {
        return n < 10 ? n : n % 10 + sum(n / 10);
    }

    static int prod(int n) {
        return n < 10 ? n : n % 10 * prod(n / 10);
    }

    static int rever(int n) {
        sum = sum * 10 + n % 10;
        return n < 10 ? sum : rever(n / 10);
    }

    static int rever2(int n) {
        int digits = (int)Math.log10((double)n);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        return n < 10 ? n : n % 10 * (int)Math.pow(10.0D, (double)digits) + helper(n / 10, digits - 1);
    }

    static int rever3(int n, int sum) {
        sum = sum * 10 + n % 10;
        return n < 10 ? sum : rever3(n / 10, sum);
    }
}
