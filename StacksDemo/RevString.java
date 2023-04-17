package DS.StacksDemo;

import java.util.Stack;

public class RevString {

    // When stack is used - Run time complexity is O(n)
    public String reversedString(String input) {

        if(input==null)
            throw new IllegalArgumentException();
            
        Stack<Character> stack = new Stack<>();

        // for (int i = 0; i < input.length(); i++) {
        //     stack.push(input.charAt(i));
        // }

        // using effective way
        for (Character character : input.toCharArray())
            stack.push(character);

        // char[] strchar = new char[input.length()];

        // for (int i = 0; i < strchar.length; i++) {
        //     strchar[i]=stack.pop();
        // } 
        /* the above method is not effective in case of memory
         * StringBuffer --> used when lot of string manipulation operations are performed
         */
        StringBuffer reversed = new StringBuffer();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();
        
    }
}
