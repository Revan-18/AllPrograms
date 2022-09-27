package recursion.backtracing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    static int numberoftimes=0;
    static int numberoftimesj=0;

    public static void main(String[] args) {
        int target = new Scanner(System.in).nextInt();
        int currIndex = 0;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = List.of(2, 3, 5);
        cobmnSum(lists, list, currIndex, target, new ArrayList<Integer>());
        System.out.println(lists);
        System.out.println(numberoftimes);
        System.out.println(numberoftimesj);
    }

    private static void cobmnSum(List<List<Integer>> lists, List<Integer> list, int currIndex,
                                 int target, List<Integer> sumList) {

//        if (currIndex == list.size()){

            if (target == 0) {
                lists.add(sumList);
                 return;
        }
        if (currIndex == list.size()) {
            return;
        }
        if (target >= list.get(currIndex)) {
            sumList.add(list.get(currIndex));
            cobmnSum(lists, list, currIndex, target - list.get(currIndex),
                    new ArrayList<>(sumList));
            sumList.remove(sumList.size() - 1);
            numberoftimesj++;
        }
        numberoftimes++;
        cobmnSum(lists, list, currIndex + 1, target, new ArrayList<>(sumList));
    }
}
