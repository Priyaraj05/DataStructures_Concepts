package DS.StacksDemo;

import java.util.Stack;


public class BalancedStr {
    public boolean MBalancedStr(String input) {

        Stack<Character> stack = new Stack<>();
        for (Character character : input.toCharArray()) {
            if(leftBrackets(character))
                stack.push(character);
            else if(rightBrackets(character)){
                if(stack.isEmpty())
                    return false;
                var left = stack.pop();
                if(bracketsNotMatches(left,character))   return false;

            }
        }
        return stack.isEmpty();
    }

    private boolean leftBrackets(char character) {
        return (character == '('|character == '{'|character == '['|character == '<');
    }

    private boolean rightBrackets(char character){
        return (character == ')'|character == '}'|character == ']'|character == '>');
    }

    private boolean bracketsNotMatches(char left, char right) {
        
        return ((right == ')' && left != '(') |
        (right == '}' && left != '{') |
        (right == ']' && left != '[') |
        (right == '>' && left != '<')); 
    }
}
