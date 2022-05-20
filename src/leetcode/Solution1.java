package leetcode;

import java.util.*;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());

        List<Integer> A = new ArrayList<>(N);
        for (int j = 0; j < N; j++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }
        int result = equalArrayValues(N,A);
        System.out.println(result);
    }

    public static int equalArrayValues(int N, List<Integer> A) {
        int total= 0;
        int min=A.get(0);
        int max=0;
        for (int i = 0; i < N; i++) {
            if(min>A.get(i))
                min=A.get(i);
            if(max<A.get(i))
                max=A.get(i);
            total+=A.get(i);
        }

        int avg1 = max-min;
       int avg=total/N;

       if(avg1>avg)
          avg=min;
        int minOp=0;

        for (int i = 0; i < N; i++) {
            minOp=minOp+Math.abs(avg-A.get(i));
        }
      return minOp;
    }
}
