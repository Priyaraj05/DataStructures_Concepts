package DS.QueuesDemo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class RevQueue {
    public static Queue<Integer> Reverse(Queue<Integer> queue) {
            Stack<Integer> stack = new Stack<>();

            while(!queue.isEmpty()){
                stack.push(queue.remove());
            }
            while(!stack.isEmpty()){
                queue.add(stack.pop());
            }
        return queue;        
    }
    public static void main(String[] args) {
        Queue<Integer> queue =  new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(Reverse(queue));
    }
}
