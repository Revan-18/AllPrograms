package recursion.backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        List<List<Integer>> lists = new ArrayList<>();
        subsets(list,lists,new ArrayList<>(),0);
        System.out.println(lists);
    }

    private static void subsets(List<Integer> list,List<List<Integer>> lists,List<Integer> output,int currInd) {
        if(currInd==list.size()) {
            lists.add(output);
            return;
        }


        subsets(list,lists,new ArrayList<>(output),currInd+1);
        output.add(list.get(currInd));
        subsets(list,lists,new ArrayList<>(output),currInd+1);
    }
}
