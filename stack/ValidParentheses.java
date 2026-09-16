// neetcode 150 easy 
// technique: stack 

package stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // create a stack that stores Characters
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // before taking something out, check if there is anything inside
                // yes -> pop()
                // no -> false
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    // check if the closing brackets match the opening ones 
                    if (c == ')' && top != '(') {
                        return false;
                    }
                    if (c == ']' && top != '[') {
                        return false;
                    }
                    if (c == '}' && top != '{') {
                        return false;
                    }       
            }
        }
    }

         // check if the stack is empty 
        return stack.isEmpty();
    }

public static void main(String[] args) {
    ValidParentheses test = new ValidParentheses();
    boolean result = test.isValid("([{}])");
    System.out.println(result);
}
}


