package Tester;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(9);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.isEmpty());
        treeSet.remove(9);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(7));
        treeSet.clear();
        System.out.println(treeSet);
    }
}
