package BinarySearchTree;

import java.util.Scanner;

public class DeleteNode {

    Node root;

    static class Node{
        int key;
        Node left,right;

        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    //constructor
    public DeleteNode() {
        root = null;
    }

    public DeleteNode(int key){
        root = new Node(key);
    }



    public void insert(int i){
        root = insertNode(root,i);
    }

    public Node insertNode(Node r,int i){
        if(r == null) {
            r = new Node(i);
            return r;
        }
            if (i<r.key)
             r.left =  insertNode(r.left,i);
            else r.right =  insertNode(r.right,i);

            return r;
    }

    public void inorder(Node r){
        if (r==null)
            return;
        inorder(r.left);
        System.out.println(r.key);
        inorder(r.right);
    }



    public static void main(String[] args) {
        DeleteNode in = new DeleteNode();

        in.insert(40);
        in.insert(50);
        in.insert(30);
        in.insert(20);

        in.inorder(in.root);

        Scanner n= new Scanner(System.in);
        in.delete(n.nextInt());

        System.out.println("after delete");
        in.inorder(in.root);

    }

    private void delete(int key) {
        if(root==null)
            return ;

        if(root.key == key){
             root = helper(root);
        }

        else {
            Node dummy = root;
            while (dummy!=null) {
                if (dummy.key >= key) {
                    if (dummy.left != null && dummy.left.key == key) {
                        dummy.left = helper(dummy.left);
                    } else {
                        dummy = dummy.left;
                    }
                } else {
                    if (dummy.right != null && dummy.right.key == key) {
                        dummy.right = helper(dummy.right);
                    } else {
                        dummy = dummy.right;
                    }
                }
            }

        }
    }

    private Node helper(Node r) {
        if(r.right == null){
            return r.left;
        }
        if (r.left == null){
            return r.right;
        }
       //Node right = r.right;
        Node erigtht = findextrearight(r.left);
        erigtht.right = r.right;

        return r.left;

    }

    private Node findextrearight(Node r) {

        if(r.right == null)
            return r;
        return findextrearight(r.right);
    }


}
