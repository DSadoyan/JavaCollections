package Tester;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Abc1");
        hashMap.put(2,"Abc2");
        hashMap.put(3,"Abc3");
        hashMap.put(4,"Abc4");
        hashMap.put(5,"Abc5");
//        hashMap.put(1,"Abc7");
//        hashMap.put(33,"Abc5");
//        hashMap.put(17,"Abc8");
//        hashMap.put(null,"Abc0");
//          hashMap.put(6,null);
//        hashMap.putIfAbsent(1,"Abcd1");
        System.out.println(hashMap);
        System.out.println(hashMap.get(3));
        hashMap.remove(5);
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("Abc1"));
        System.out.println(hashMap.containsKey(6));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        HashMap<String, String> hashMap1= new HashMap<>();
        hashMap1.put("1","Abc1");
        hashMap1.put("2","Abc");
        hashMap1.put("3","Abc3");
        hashMap1.put("4","Abc4");
        hashMap1.put("5","Abc5");
        System.out.println(hashMap1);

        HashMap<Integer,Integer>hashMap2 = new HashMap<>();
        hashMap2.put(1,10);
        hashMap2.put(2,20);
        hashMap2.put(3,30);
        hashMap2.put(4,40);
        hashMap2.put(5,50);
        System.out.println(hashMap2);

    }
}
