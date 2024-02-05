package Testing;

import java.util.*;

public class TreeMapTesting {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm = new TreeMap<>();
        tm.put(99,"Ashot");
        tm.put(33,"Karen");
        tm.put(22,"Levon");
        tm.put(11,"Gohar");
        tm.put(55,"Lilit");
        System.out.println(tm);
        Set<Map.Entry<Integer,String>> set =tm.entrySet();
        Iterator<Map.Entry<Integer,String>>iterator = tm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String>my = (Map.Entry<Integer,String>)iterator.next();
            System.out.println(my.getKey() + " " + my.getValue());
        }
    }
}
