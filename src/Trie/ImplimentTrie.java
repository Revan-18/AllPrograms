package Trie;

 class Node {
     Node links[] = new Node[26];
     boolean flag=false;


   public Node() {
    }

     public boolean cotainsKey(char ch) {
       return (links[ch - 'a']!=null);
     }

     public void put(char ch, Node node) {
       links[ch - 'a'] = node;
     }

     public void setEnd() {
       flag=true;
     }

     public Node get(char ch) {
       return links[ch-'a'];
     }

     public boolean isEnd() {
       return flag;
     }
 }

public class ImplimentTrie{
     private static Node root;

     ImplimentTrie(){
         root = new Node();

     }

    public static void insert(String word) {
        Node node = root;

        for (int i = 0; i < word.length(); i++) {
            if (!node.cotainsKey(word.charAt(i)))
                node.put(word.charAt(i), new Node());
            node = node.get(word.charAt(i));
        }
        node.setEnd();

    }

    public static boolean search(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if(!node.cotainsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));

        }
        return node.isEnd();
    }


    public static boolean startsWith(String word){
         Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if(!node.cotainsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return true;
    }

}
