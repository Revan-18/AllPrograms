package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summane {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list1=new ArrayList<>(list);
        list1.add(2);
        System.out.println(list);
        System.out.println(list1);
    }
}
