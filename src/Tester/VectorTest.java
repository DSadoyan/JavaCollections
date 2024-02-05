package Tester;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector<>();
        vector.add(6);
        vector.add(8);
        vector.add(7);
        vector.add(3);
        vector.add(5);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
