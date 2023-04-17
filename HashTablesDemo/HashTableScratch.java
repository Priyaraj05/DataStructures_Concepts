package DS.HashTablesDemo;

import java.util.*;


public class HashTableScratch {
    //put(k,v)
    //get(k) : v
    // remove(k)
    // k : int, v : string
    // collisions : chaining (Linked list)
    private class KeyValueEntry{
        private int key;
        private String value;
    
        KeyValueEntry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }


    LinkedList<KeyValueEntry>[] entries = new LinkedList[5];
    
    public void put(int key, String value) {
        int index = hash(key);
        // if the bucket is empty, create a new LL
        if(entries[index] == null)
            entries[index] = new LinkedList<>();
        
        /* to avoid duplicate values, traverse through 
         * each bucket and look for keys, 
         * if duplicate update the value */

        var bucket = entries[index];
        for (var entry: bucket ) {
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }
        // else add new entry to the bucket
        bucket.addLast(new KeyValueEntry(key, value));
    }

    public String get(int key) {
        var index = hash(key);
        var bucket = entries[index];
        
        if(bucket != null){
            for (var entry : bucket) {
                if(entry.key == key)
                    return entry.value;
            }  
        }
        
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        var bucket = entries[index];
        if(bucket == null)
         throw new IllegalStateException();
        for (var entry : bucket) {
            if(entry.key == key){
                bucket.remove(entry);
                return; 
            }         
        }
        throw new IllegalStateException();
    }
    
    private int hash(int key) {
        return key % entries.length;
    }

}


