package recursion.kunal_kushwaha;

import java.util.ArrayList;
import java.util.Scanner;

public class Linear_search {
    static ArrayList<Integer> list = new ArrayList();

    public Linear_search() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 6, 3, 1, 8, 9, 10, 3};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(search(arr, target, 0));
        System.out.println(findindex(arr, target, 0));
        findAllIndex(arr, target, 0);
        System.out.println(list);
        System.out.println(findAllIndexwithlist(arr, target, 0, new ArrayList()));
        System.out.println(findAllIndexwithoutlist(arr, target, 0));
    }

    private static int findindex(int[] arr, int target, int i) {
        if (arr[i] == target) {
            return i;
        } else {
            return i == arr.length - 1 ? -1 : findindex(arr, target, i + 1);
        }
    }

    private static boolean search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        } else {
            return arr[i] == target || search(arr, target, i + 1);
        }
    }

    private static void findAllIndex(int[] arr, int target, int i) {
        if (i != arr.length) {
            if (arr[i] == target) {
                list.add(i);
            }

            findAllIndex(arr, target, i + 1);
        }
    }

    private static ArrayList<Integer> findAllIndexwithlist(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        } else {
            if (arr[i] == target) {
                list.add(i);
            }

            return findAllIndexwithlist(arr, target, i + 1, list);
        }
    }

    private static ArrayList<Integer> findAllIndexwithoutlist(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList();
        if (i == arr.length) {
            return list;
        } else {
            if (arr[i] == target) {
                list.add(i);
            }

            ArrayList<Integer> prel = findAllIndexwithoutlist(arr, target, i + 1);
            if (prel != null) {
                list.addAll(prel);
            }

            return list;
        }
    }
}
