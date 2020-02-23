package app.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainFunc {






    public static void main(String[] args) {

        TrieTree tree = new TrieTree();

        tree.insertWord("i");
        tree.insertWord("like");
        tree.insertWord("sam");
        tree.insertWord("sung");
        tree.insertWord("samsung");
        tree.insertWord("mobile");
        tree.insertWord("ice");
        tree.insertWord("cream");
        tree.insertWord("mango");

        List<String> sentence = tree.breakWord("ilikesamsungmobile");

        sentence.forEach(e-> System.out.println(e));
    }



}
