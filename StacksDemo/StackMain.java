package DS.StacksDemo;

public class StackMain {
    public static void main(String[] args) {
        // RevString revString = new RevString();
        // System.out.println(revString.reversedString("Hello"));
        BalancedStr balancedStr = new BalancedStr();
        var result = balancedStr.MBalancedStr("{90)");
        System.out.println(result);
        result = balancedStr.MBalancedStr("{[78]+(90)}");
        System.out.println(result);
        // ScratchStackfromArr stack = new ScratchStackfromArr(5);
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack);
        // stack.push(30);
        // stack.push(50);
        // System.out.println(stack);
        
    }
}
