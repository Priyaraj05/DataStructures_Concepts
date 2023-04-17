package DS.QueuesDemo;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        // Queue is an interface and implements ArrayDeque Class
        Queue<Integer> queue = new ArrayDeque<>(); 
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
