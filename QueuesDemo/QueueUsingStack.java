package DS.QueuesDemo;

import java.util.Stack;

public class QueueUsingStack {
   Stack<Integer> stack1;
   Stack<Integer> stack2 = new Stack<>();
   
   public QueueUsingStack(){
    stack1 = new Stack<>();
   }

   public void enQueue(int item){
    stack1.push(item);
   }

   public int deQueue(){
    if(isEmpty())
        throw new IllegalStateException();

    MoveStack1toStack1();
    
    return stack2.pop();
   }

   public int peek(){
    if(isEmpty())
        throw new IllegalStateException();

    MoveStack1toStack1();
    
    return stack2.peek();
   }
   
   private void MoveStack1toStack1() {
    if(stack2.isEmpty())
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

   public boolean isEmpty(){
     return stack1.isEmpty() && stack2.isEmpty();
   }
}
