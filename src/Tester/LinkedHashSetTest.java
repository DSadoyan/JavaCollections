package Tester;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer>linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        linkedHashSet.remove(4);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(4));
        System.out.println();
    }
}
