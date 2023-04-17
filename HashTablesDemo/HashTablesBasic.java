package DS.HashTablesDemo;

import java.util.HashMap;
import java.util.Map;

public class HashTablesBasic {
    public static void main(String[] args) {
        //Key: Student ID (Integer)
        //Value: Student Name (String)
        Map<Integer,String> map = new HashMap<>();
        // Map is an Interface that implements HashMap class
        map.put(1, "pinky");
        map.put(2,"john");
        map.put(3, "rosy");
        System.out.println(map);
       
        // HashMaps doesn't allow duplicate keys ie.,
        // the below example,replaces the value of already existing key 
        map.put(2, "joe"); 
        System.out.println(map);
        
        //They allow null keys and values
        map.put(4, null);
        map.put(null, null); 
        System.out.println(map);

        map.remove(null);
        
        System.out.println(map);
        for (var item : map.keySet())
            System.out.println(item);
        
        for (var item : map.entrySet()) 
            System.out.println(item);
            
        

        map.containsKey(1); // O(1)
        map.containsValue("john"); // O(n)
    }
}
