package Other.Intresting;

public class AllSubSets {
    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c'};
        allSubSets(set);
    }

    private static void allSubSets(char[] set) {
        int n = set.length;
        int pon = (int) Math.pow(2, n);

        for (int i = 0; i < pon; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j]);
            }
            System.out.println();
        }
    }
}
