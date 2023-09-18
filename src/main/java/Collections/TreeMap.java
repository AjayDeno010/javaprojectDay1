package Collections;

import java.util.Comparator;
import java.util.Map;
public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<Integer,String> Tree= new java.util.TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(01);
            }
        });
        Tree.put(100,"Jhon");
        Tree.put(340,"Aj");
        Tree.put(23,"Ak");
        Tree.put(560,"hello");
        Tree.put(87,"Macha");
        System.out.println(Tree);
    }
}
