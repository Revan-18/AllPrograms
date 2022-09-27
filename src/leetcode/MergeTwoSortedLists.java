package leetcode;

import DataStructure.LinkedList.LinkedList;

import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists.Solution solution = new MergeTwoSortedLists().new Solution();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        ListNode listNode = solution.mergeTwoLists(listNode1, listNode2);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {


        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode list = new ListNode();
            ListNode head=list;

            while (list1 != null && list2 != null) {

                if (list1.val <= list2.val) {
                    insertNode(list, list1.val);
                    list1 = list1.next;
                } else {
                    insertNode(list, list2.val);
                    list2 = list2.next;
                }

            }
            if (list1 != null) {
                while (list.next != null)
                    list = list.next;
                list.next = list1;
            } else if (list2 != null) {
                while (list.next != null)
                    list = list.next;
                list.next = list2;
            }
            return head;

        }

        public void insertNode(ListNode list, int data) {
            ListNode new_node = new ListNode(data);
            new_node.next = null;

            if (list.val == 0) {
                list.val = new_node.val;
            } else {
                ListNode last = list;
                while (last.next != null)
                    last = last.next;

                last.next = new_node;
            }
        }
    }
}
