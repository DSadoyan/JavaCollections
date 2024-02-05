package Tester;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        queue.add(9);
        queue.add(3);
        queue.add(8);
        queue.add(2);
        queue.add(6);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.remove());
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
    }
}
