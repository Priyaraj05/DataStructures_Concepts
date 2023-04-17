package DS.QueuesDemo;

import java.util.Arrays;

//enQueue
//deQueue
//peek
//isEmpty
//isFull


public class ScratchQueue {
    private int[] arrayitems;
    private int front,rear;
    private int sizecount;
    
    ScratchQueue(int size){
        arrayitems = new int[size];
    }

    public void enqueue(int item) {     
        arrayitems[rear] = item;
        /* Consider an example, after adding(enqueue) all elements front=0, rear=4
         * [10,20,30,40,50]
         *  F           R 
         * if 2 items are removed, 
         * [0,0,30,40,50] --> front=2, rear=4
         *      F     R --> when a new item is added, Rear will go to 5(index out of bound)
         * Here, circular arrays are used to achieve efficient management of buffer data
         * when a new item(60) is added,
         * [60,0,30,40,50] --> front = 2, rear=(rear+1)%5=0
         *  R    F
         * when a new item(70) is added,
         * [60,70,30,40,50] --> front = 2, rear=(rear+1)%5=1
         *     R  F
         */
        rear = (rear + 1) % arrayitems. length; 
        sizecount++;
    }

    public int dequeue(){
        if(isEmpty())
            throw new NullPointerException();

        int removedItem = arrayitems[front];
        arrayitems[front] = 0;
        front = (front + 1) % arrayitems.length;// circular array
        sizecount--;
        return removedItem;
    }
    
    public boolean isEmpty() {
        return sizecount<0;
    }
    @Override
    public String  toString() {
        return (Arrays.toString(arrayitems));
    }

    


}
