package BinarySearchTree;

public class Bst {

    static class Node{
        Integer key;
        Node left,right;

        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }
     Node root;

    public Bst() {
        root = null;
    }
    public Bst(int key){
        root = new Node(key);
    }

    public void insert1(int i) {
        if (root == null) {
            root = new Node(i);
            return;
        }
        Node cur = root;
        while (true) {
            if (cur.key <= i) {
                if(cur.right != null) cur=cur.right;
                else {
                    cur.right = new Node(i);
                    break;
                }
            }else {
                if(cur.left != null) cur=cur.left;
                else {
                    cur.left = new Node(i);
                    break;
                }
            }
        }
    }




    public void inorder(Node r){
        if (r==null)
            return;
        inorder(r.left);
        System.out.println(r.key);
        inorder(r.right);
    }



    public static void main(String[] args) {
        Bst in = new Bst();

        in.insert1(90);
        in.insert1(40);
        in.insert1(50);
        in.insert1(30);
        in.insert1(20);
        in.insert1(10);



        in.inorder(in.root);

    }

}
