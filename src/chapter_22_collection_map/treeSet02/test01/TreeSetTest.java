package chapter_22_collection_map.treeSet02.test01;/*
 * ===========================================================
 * fileName       : TreeSetTest
 * date           : 2024-01-30
 * description    :
 * ===========================================================
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });

        treeSet.add("aaa");
        treeSet.add("bbb");
        treeSet.add("ccc");
        treeSet.add("ddd");

        for (String s: treeSet
             ) {
            System.out.println(s);
        }
    }
}
