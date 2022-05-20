package DynamicProgramming.fibb;

import java.util.Scanner;

public class Fibb_space_opt {
    public static void main(String[] args) {
        int prev=1,prev2=0,curi;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=2;i<=n;i++){
            curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }
}
