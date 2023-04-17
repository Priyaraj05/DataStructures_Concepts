package DS.LinkedListDemo;

import java.util.NoSuchElementException;


public class LinkedList {
    private Node first;
    private Node last;
    private Node preNode;
    private Node nexNode;
    private int size;

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
            next = null;
        }
    }

    
    //add at last - run time complexity - O(1)
    public void addlast(int item){
        
        var node = new Node(item);
        
        // if list is empty, set the item to first and last node
        if (isEmpty()) 
            first = last = node;            
        else { // append that node at the end of list
            last.next = node; //link last node to new node
            last = node; // point last to new node
        }
        size++;
    }

    // // add at first - run time complexity - O(1)
     public void addfirst(int item){
        
        var node = new Node(item);
        if (isEmpty()) 
            first = last = node; 
        else{
            node.next = first;
            first = node;
        }
        size++;  
     }

     private boolean isEmpty(){
        return first == null;
     }

     // to find the index of given value - run time complexity - O(n)
     public int indexOf(int item) {
        int index = 0;
        var current = first;
        

        while (current != null ) {
            if (current.value == item) 
                return index;

            current = current.next;
            index++;
        }
        return -1; // if value doen't exist in the list, returns -1
     }

     // contains the given value - run time complexity - O(n)
     public boolean containsValue(int item) {
        
        // using indexOf(), we can return the boolean
        return indexOf(item) != -1;
     }

     // remove the first item in the list - run time complexity - O(1)
     public void removeFirst() {
        
        // if the list is empty
        if (isEmpty())
            throw new NoSuchElementException();
       
        // if the list has only one item, remove that one item 
        if(first.next == null)
            first = last = null;
        else{
            //if the list has atleast 2 items, Example : Consider the List, 10 --> 20 --> 30
            var second = first.next; // second is pointing to 20
            first.next = null; // removing the link btw 10 and 20 i.e., 10  20 --> 30
            first = second; //  head is pointing to the second node
        }
        size--;
        
       
    }

    // remove the first item in the list - run time complexity - O(n)
    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        
        else if(first.next == null)
            first = last = null;
        else{
            var current = first;
            while(current != null){
                if(current.next == last){
                    preNode = current; // store th previous value
                    last = preNode; // tail is pointing to previous node
                    last.next = null; // remove the link
                }
                current = current.next;
            }
        }
        size--;
    }

    public int size(){
        return size;
    }
    

    public int[] toArray(int size) {
        var current = first;
        int array[] = new int[size];
        int i =0;
        while(current != null){
            array[i++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverseList(){
        // (H)10 --> 20 --> 30--> 40(T) --> null
        // null <--(T)10 <-- 20 <-- 30<--40(H)
        if(isEmpty())
            throw new NoSuchElementException();

        preNode = first; // 10
        var current = first.next; // 20
        while(current !=null){ //current= 20 | 30 | 40
            nexNode = current.next;// 30 | 40 | null
            current.next = preNode;// 10<--20  30 | 10<--20<--30  40 |10<--20<--30<--40
            preNode = current;// 20 | 30 |40
            current = nexNode;// 30 | 40 | null
        }
        last = first; // 10(last)
        last.next = null; // null<--10(last)
        first = preNode; // 40(first)
        //null<--10(last)<--20<--30<--40(first)
    }

    public int kthElementfromEnd(int k) {
        /*{refer notes for the explanation}
         *10 --> 20 --> 30 --> 40 --> 50
         *(5)    (4)    (3)    (2)    (1)  
         * k = 3  return 30
         * k = 1  return 50
         */

        if(isEmpty())
            throw new IllegalArgumentException();
        var p1 = first;
        var p2 = first;
        for (int i = 0; i < k-1; i++) {
            p2 = p2.next;
            if(p2 == null)
                throw new IllegalArgumentException();
        }
        while(p2.next != null){     
            p1 = p1.next; 
            p2 = p2.next;
        }
        return p1.value;
    }

}
