package BinarySearchTree;

public class Bst_recur {

    static Node root;

    static class Node{
        int key;
        Node left,right;

        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    //constructor
    public Bst_recur() {
        root = null;
    }

    public Bst_recur(int key){
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
        Bst_recur in = new Bst_recur();

        in.insert(40);
        in.insert(50);
        in.insert(30);
        in.insert(20);


        in.inorder(root);

    }

}
