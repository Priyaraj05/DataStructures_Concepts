package DS.QueuesDemo;

import java.util.Arrays;

public class PriorityQueueScratch {
    
    private int[] arrayitems;
    private int sizecount;
    public PriorityQueueScratch(int capacity){
        arrayitems = new int[capacity];
    }

    public void insert(int item) {
        if(isEmpty()){
            arrayitems[0] = item;
            sizecount++;
        }
        else{
           for(int i= sizecount-1;i>=0;i--){// 1 
                if(item<arrayitems[i])//3<5
                {
                    arrayitems[i+1] = arrayitems[i];//a[1]=5
                    arrayitems[i] = item;//a[0]=3
                    sizecount++;//2
                }   
                else
                {
                    arrayitems[i+1] = item;
                    sizecount++; 
                    break;
                }
            } 
        }  
    }

    public boolean isEmpty() {
        return sizecount == 0;
    }

    @Override
    public String  toString() {
        return (Arrays.toString(arrayitems));
    }
}
