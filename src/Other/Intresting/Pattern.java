package Other.Intresting;

public class Pattern {
    public static void main(String[] args) {
        pattern1(4);

    }

    private static void pattern1(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();
        pattern1(n - 1);

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();


    }

}
