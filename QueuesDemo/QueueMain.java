package DS.QueuesDemo;

public class QueueMain {
    public static void main(String[] args) {
    
        ScratchQueue queue = new ScratchQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(60);
        System.out.println(queue);
        queue.enqueue(70);
        System.out.println(queue);

        // Queue using Stack
        // QueueUsingStack qUsingStack = new QueueUsingStack();
        // qUsingStack.enQueue(10);
        // qUsingStack.enQueue(20);
        // qUsingStack.enQueue(30);
        // qUsingStack.enQueue(40);
        // qUsingStack.enQueue(50);
        
        // PriorityQueueScratch pqs = new PriorityQueueScratch(5);
        // pqs.insert(5);
        // pqs.insert(3);
        // pqs.insert(6);
        // pqs.insert(7);
        // pqs.insert(2);
        // pqs.insert(100);
        // System.out.println(pqs);
    }
}
