package Tester;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer>hashSet = new HashSet<>();
        hashSet.add(8);
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(6);
//        hashSet.add(null);
        System.out.println(hashSet);
        hashSet.remove(5);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains(8));
        String[] names = {"Aram","Gor","Ani","Aram","Gor","Ani",};
        Set<String> hs = new HashSet<>(Arrays.asList(names));
        System.out.println(hs);
        System.out.println(hs.size());
        TreeSet<String> tSet = new TreeSet<>(Arrays.asList(names));
        System.out.println(tSet);
        TreeSet<Integer>treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);


//        hashSet.add(5);
//        System.out.println(hashSet);
//        for (Integer i : hashSet){
//            System.out.println(i);
//        }


    }
}
