package DS.StacksDemo;

import java.util.Arrays;

public class ScratchStackfromArr {    
    private int size;
    private int top = 0;
    private int[] arrayitems;
    public ScratchStackfromArr(int size){
        this.size = size;
        arrayitems = new int[size];
    }

    public void push(int item) {
        if(top == size)
            throw new StackOverflowError("stack is full");
       
        arrayitems[top++] = item;   
    }

    public int pop() {
        if(isEmpty())
            throw new IllegalStateException();
        
        return  arrayitems[--top];    
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        
        return arrayitems[top-1];
    }

    @Override
    public String  toString() {
        var content = Arrays.copyOfRange(arrayitems, 0, top);
        return (Arrays.toString(content));
    }

    public boolean isEmpty(){
        return top==0;
    }
}
