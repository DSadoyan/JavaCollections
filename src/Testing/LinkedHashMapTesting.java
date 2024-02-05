package Testing;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTesting {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lhm = new LinkedHashMap<>();
        lhm.put(33,"Alla");
        lhm.put(22,"Anna");
        lhm.put(15,"Gor");
        lhm.put(16,"Ani");
        lhm.put(5,"Suren");
        lhm.put(20,"Ruben");
        System.out.println(lhm);
        Set<Map.Entry<Integer,String>>set = lhm.entrySet();
        Iterator<Map.Entry<Integer,String>>iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> m = (Map.Entry<Integer,String>) iterator.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
