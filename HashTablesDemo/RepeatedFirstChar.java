package DS.HashTablesDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedFirstChar {
    public static void main(String[] args) {
        String smessage = "re hgjfbm dvbvqw";
        String message = smessage.replaceAll(" ", "");
       
        RepeatedFirstChar rfc = new RepeatedFirstChar();
        //System.out.println(rfc.RepFCFn_HashMap(message)); 
        System.out.println(rfc.RepFCFn_Set(message));;    
    }

    public  char RepFCFn_HashMap(String message) {
        Map<Character,Integer> map = new HashMap<>();
        char chars[] = message.toCharArray();
        
        for (Character ch : chars) {
            // if(map.containsKey(ch)){
            //     var count = map.get(ch)+1;
            //     map.put(ch,count);
            // }
            // else
            //     map.put(ch,1);
            // efficient way to do the same method,
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count+1);
        }
        System.out.println(map);
        for (Character ch : chars) {
            if(map.get(ch)>1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    public char RepFCFn_Set(String message) {
      
        Set<Character> set = new HashSet<>();
        char chars[] = message.toCharArray();
        
        for (char ch : chars){
            if(set.contains(ch))
                return ch;
            else 
                set.add(ch);
        }
        
        return Character.MIN_VALUE;
    }
}
