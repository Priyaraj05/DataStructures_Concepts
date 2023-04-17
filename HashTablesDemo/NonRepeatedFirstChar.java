package DS.HashTablesDemo;

import java.util.HashMap;
import java.util.Map;

/* Find the first non repeated character
 * Ex: apple looks good]
 * first non repeated character is 'a'
 */
public class NonRepeatedFirstChar {
    public static void main(String[] args) {
        String smessage = "gre heergjfbm dvbvqw";
        String message = smessage.replaceAll(" ", "");
        NonRepeatedFirstChar npr = new NonRepeatedFirstChar();
        System.out.println(npr.NonRepCharFn(message));
        // for(Character ch : message.toCharArray())
        //     if(message.indexOf(ch) == message.lastIndexOf(ch)){
        //         System.out.println(ch);
        //         break;
        //     }

        /*efficient way to implement the above 
        logic is using HashMap because, 
        the lookup operation takes O(1) complexity*/
        
    }

    public Character NonRepCharFn(String message){

        Map<Character,Integer> map = new HashMap<>();
        char chars[] = message.toCharArray();

        for (Character ch : chars) {
            if(map.containsKey(ch)){
                var count = map.get(ch)+1;
                map.put(ch, count);
            }
            else
                map.put(ch, 1);
        }

       for (Character ch : chars) {
            if(map.get(ch) == 1){
                return ch;
            }
       }
        return Character.MIN_VALUE;// used bcz, it returns nothing if all characters are repeated
    }
}
