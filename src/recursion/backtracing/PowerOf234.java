package recursion.backtracing;

//n^0 == 1

public class PowerOf234 {
    public static void main(String[] args) {
        System.out.println(power2(64));
        System.out.println(power3(3));
        System.out.println(power4(128));
    }

    private static boolean power4(int i) {
        if (i == 1)
            return true;

        return (i % 4 == 0) && power4(i / 4);
    }

    private static boolean power3(int i) {
        if (i == 1)
            return true;

        return (i % 3 == 0) && power3(i / 3);
    }

    private static boolean power2(int i) {
        if (i == 1)
            return true;

        return (i % 2 == 0) && power2(i / 2);
    }
}
