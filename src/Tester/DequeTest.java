package Tester;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer>deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);
        deque.add(7);
        deque.add(9);
        deque.add(5);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        deque.addFirst(4);
        deque.addLast(6);
        System.out.println(deque);
        deque.offerFirst(11);
        deque.offerLast(33);
        System.out.println(deque);
        System.out.println(deque.getLast());
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
