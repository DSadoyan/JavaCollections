package Tester;

import java.util.PriorityQueue;

public class PriorityQueueTest1 {
    public static void main(String[] args) {
        PriorityQueue<String>priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Elen");
        priorityQueue.add("Boris");
        priorityQueue.add("Jora");
        priorityQueue.add("Gor");
        priorityQueue.add("Ani");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.isEmpty());


    }
}
