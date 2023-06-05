package practice;
import java.util.Stack;
public class BalancedParentheses {

    public static void main (String[] args) {
        BalancedParentheses b = new BalancedParentheses();
        String input="{([])}";
        String input2="[](){}";
        String input3="[()]}";

        System.out.println("Is balanced? "+b.isBalanced(input));
        System.out.println("Is balanced? "+b.isBalanced(input2));
        System.out.println("Is balanced? "+b.isBalanced(input3));
    }

    private boolean isBalanced (String input) {
        char[] charArr = input.toCharArray();
        Stack stack = new Stack();
        for(char ch:charArr){
            if(ch=='{' || ch=='(' ||ch=='['){
                stack.push(ch);
            }else if(ch=='}'||ch==')'||ch==']'){
                if(stack.isEmpty()) return false; // no corresponding opening parentheses found.
                char top = (char) stack.pop(); // pop the top element from the stack.
                if((ch=='}'&&top!='{')||(ch==')'&&top!='(')||(ch==']'&&top!='[')){
                    return false; // mismatched parentheses
                }
            }
        }
        return stack.isEmpty(); // stack should be empty if all parentheses are balanced.
    }
}
