package Tester;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Abc1");
        linkedHashMap.put(2,"Abc2");
        linkedHashMap.put(3,"Abc3");
        linkedHashMap.put(4,"Abc4");
        linkedHashMap.put(5,"Abc5");
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(1));
        System.out.println(linkedHashMap.isEmpty());

    }
}
