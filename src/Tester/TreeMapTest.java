package Tester;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Abc1");
        treeMap.put(6, "Abc6");
        treeMap.put(2, "Abc2");
        treeMap.put(3, "Abc3");
        treeMap.put(4, "Abc4");
        treeMap.put(5, "Abc5");

        System.out.println(treeMap);
        System.out.println(treeMap.get(6));
        treeMap.remove(6);
        System.out.println(treeMap);
    }
}
