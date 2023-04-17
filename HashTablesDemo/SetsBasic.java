package DS.HashTablesDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetsBasic {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int arrays[] = {1,2,2,4,4,4,6,6,7};
        for (int i : arrays) 
            set.add(i);
        System.out.println(set); // removes duplicate values
    }
}
