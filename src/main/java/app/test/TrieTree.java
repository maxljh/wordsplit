package app.test;

import java.util.ArrayList;
import java.util.List;

public class TrieTree {

    public class TrieNode {

        private int num;
        private TrieNode[] son;
        private char val;
        private boolean isWord;

        TrieNode() {

            this.num = 1;
            this.son = new TrieNode[26];
            this.isWord = false;
        }
    }


    private TrieNode root;

    TrieTree() {
        root = new TrieNode();
    }

    public void insertWord(String str) {

        if (str == null || str.length() == 0) return;
        char[] letter = str.toCharArray();
        TrieNode node = root;
        int pos=0;
        for (int i = 0; i < letter.length; i++) {
             pos= letter[i] - 'a';
            if (node.son[pos] == null) {
                node.son[pos] = new TrieNode();
                node.son[pos].val = letter[i];
                node = node.son[pos];
            }
        }
        node.isWord = true;
    }


    public List<String> breakWord(String str) {

        if (str == null || str.length() == 0) return null;
        else {
            char[] letter = str.toCharArray();
            TrieNode node = root;
            StringBuilder word = new StringBuilder();
            List<String> allWord = new ArrayList<>();
            for (int i = 0; i < letter.length; i++) {
                int pos = letter[i] - 'a';
                if (node.son[pos] != null)
                {
                    if (node.son[pos].isWord) {
                        word.append(node.son[pos].val);
                        allWord.add(word.toString());
                        word.delete(0,word.length());
                        node = root;
                    } else {
                        word.append(node.son[pos].val);
                        node = node.son[pos];
                    }

                }
            }
            return allWord;
        }

    }


}
