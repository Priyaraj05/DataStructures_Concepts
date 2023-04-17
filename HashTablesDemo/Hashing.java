package DS.HashTablesDemo;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        // Consider the capacity as 100 (size) --> the index of keys will be store as key % size
        // If the key value has Integer type
        Map<Integer, String> imap = new HashMap<>();
        imap.put(12345,"Ha");
        System.out.println(intergerhash(12345));
       
        // If the key value has string type
        Map<String, String> smap = new HashMap<>();
        smap.put("12345","Ri");
        System.out.println(stringhash("12345A"));
    }
    public static int stringhash(String key) {
        int hash = 0;
        for (Character character : key.toCharArray()) {
            hash += character;
        }
        return hash % 100;
    }

    public static int intergerhash(int key) {
        return key % 100;
    }
}
