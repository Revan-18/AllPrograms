package DataStructure.LinkedList;



public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static public LinkedList insertNode(LinkedList list,int data){
        Node new_node = new Node(data);
        new_node.next=null;

        if(list.head==null)
            list.head=new_node;
        else {
            Node last=list.head;
            while (last.next!=null)
                last=last.next;

            last.next=new_node;
        }

        return list;
    }

    public static void printList(LinkedList list){

        Node iterate=list.head;
        System.out.println("LinkedLists are");
        while (iterate!=null){
            System.out.println(iterate.data);
            iterate=iterate.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList=insertNode(linkedList,1);//ctrl+d
        linkedList=insertNode(linkedList,2);
        linkedList=insertNode(linkedList,3);
        linkedList=insertNode(linkedList,4);

        printList(linkedList);
    }
}
