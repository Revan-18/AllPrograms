package Trie;

class Node2{
    Node2 links[] = new Node2[26];
   int countWord = 0;
   int countPrefix=0;


    public Node2() {
    }

    public boolean containsKey(char ch) {
        return (links[ch - 'a']!= null);
    }

    public void put(char ch, Node2 node) {
        links[ch - 'a'] = node;
    }

    public Node2 get(char ch) {
        return links[ch - 'a'];
    }

    public void setCountPrefix() {
        countPrefix +=1;
    }

    public void setCountWord() {
        countWord +=1;
    }

    public int getCountWord() {
        return countWord;
    }

    public int getCountPrefix() {
        return countPrefix;
    }

    public void removePrefix() {
        countPrefix -=1;
    }

    public void removeWord() {
        countWord -=1;
    }
}

public class ImplimentTrie_II {
    private static Node2 root;

    ImplimentTrie_II() {
        root = new Node2();
    }

    void insert(String word) {
        Node2 node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node2());

            }
            node = node.get(word.charAt(i));
            node.setCountPrefix();
        }
        node.setCountWord();

    }

    int countWordsEqualTo(String word) {
        Node2 node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                return 0;
            }
            node = node.get(word.charAt(i));
        }
        return node.getCountWord();
    }

    int countWordsStartingWith(String word) {
        Node2 node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                return 0;
            }
            node = node.get(word.charAt(i));
        }
        return node.getCountPrefix();
    }

    void erase(String word) {
        Node2 node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                return;
            }
            node = node.get(word.charAt(i));
            node.removePrefix();
        }
        node.removeWord();
    }
}

