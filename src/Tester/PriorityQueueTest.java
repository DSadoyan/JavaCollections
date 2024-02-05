package Tester;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>();
        priorityQueue.add(99);
        priorityQueue.add(55);
        priorityQueue.add(11);
        priorityQueue.add(77);
        priorityQueue.add(55);
        priorityQueue.add(33);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.contains(22));
        System.out.println(priorityQueue.peek());
        priorityQueue.remove(55);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.isEmpty());



    }
}
