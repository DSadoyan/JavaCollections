package Testing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTesting {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Java");
        hashMap.put(5,"C#");
        hashMap.put(7,"C++");
        hashMap.put(3,"IOS");
        hashMap.put(11,"Android");
        hashMap.put(8,"Windows");
        System.out.println(hashMap);

        Set<Map.Entry<Integer,String>> set = hashMap.entrySet();
        for (Map.Entry<Integer,String> my: set){
            System.out.println(my.getKey() + " " + my.getValue());
        }
        Iterator<Map.Entry<Integer,String>>iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String>me = (Map.Entry<Integer,String>)iterator.next();
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
