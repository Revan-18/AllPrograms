package Trie;

import java.util.HashMap;
import java.util.*;

public class Trie {
    static ImplimentTrie tr = new ImplimentTrie();
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("apple", 1);
        hm.put("apollo", 1);
        hm.put("barc", 1);
        hm.put("bat", 1);

        LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<>();
        hm1.put("app", 2);
        hm1.put("appl", 3);
        hm1.put("apol", 3);
        hm1.put("batt",2);
        hm1.put("bat", 2);
        hm1.put("apple",2);


        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            operation(entry);
        }
        for(Map.Entry<String, Integer> entry : hm1.entrySet()){
            operation(entry);
        }
    }

    private static void operation(Map.Entry<String, Integer> entry) {
        switch (entry.getValue()) {
            case 1:
                tr.insert(entry.getKey());
                return;
            case 2:
                System.out.println(tr.search(entry.getKey()));
                return;
            case 3:
                System.out.println(tr.startsWith(entry.getKey()));
                return;
        }
    }
}

