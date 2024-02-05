import java.util.HashSet;

public class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");
        hashSet.add("ddd");
        hashSet.add("eee");
        System.out.println(hashSet);

        HashSet<String>hashSet1 = new HashSet<>(hashSet);
        hashSet1.add("fff");
        hashSet1.add("xxx");
        hashSet1.add("yyy");
        hashSet1.add("zzz");
        hashSet1.add("aaa");
        System.out.println(hashSet1);


    }

}
