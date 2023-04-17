package DS.LinkedListDemo;

import java.util.Arrays;

public class Node {

    public static void main(String[] args) {
        var ll = new LinkedList();
        // System.out.println(ll.size());
        ll.addlast(10);
        ll.addlast(20);
        ll.addlast(30);
        ll.addlast(40);
        ll.addlast(50);
        ll.reverseList();
        System.out.println(ll.kthElementfromEnd(3));
        System.out.println(ll.kthElementfromEnd(5));
        System.out.println(ll.kthElementfromEnd(6));
        // System.out.println(ll.size());

        // System.out.println("array items:");
        // var arrayitems = ll.toArray(ll.size());
        // System.out.println(Arrays.toString(arrayitems)); 

        // ll.removeFirst();
        // System.out.println(ll.size());

        
    }
    
}
